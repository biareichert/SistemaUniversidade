package dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import dados.Projetos;
import java.util.ArrayList;
import java.util.Date;

public class ProjetosDAO {
    private static ProjetosDAO instance = null;
    
    public static ProjetosDAO getInstance(){
        if (instance == null){
            instance = new ProjetosDAO();
        }
        return instance;
    }
    
    public ProjetosDAO(){
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("projetos");
    }
    
    public Projetos Select(int num){
        int numProjeto = 0, numMatricula = 0;
        double orcamento = 0;
        String financiador;
        Date dtFim, dtInicio;
        ArrayList<Integer> est = new ArrayList<>();
        BasicDBObject query = new BasicDBObject("numProjeto", num);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("projetos");
        DBCursor cursor = coll.find(query);
        
        Projetos p = new Projetos();
        try{
            while(cursor.hasNext()){
                BasicDBObject pro = (BasicDBObject) cursor.next();
                numProjeto = pro.getInt("numProjeto");
                financiador = pro.getString("financiador");
                dtFim = pro.getDate("dtFim");
                dtInicio = pro.getDate("dtFim");
                orcamento = pro.getDouble("orcamento");
                numMatricula = pro.getInt("numMatricula");
                est = (ArrayList<Integer>) pro.get("estudantes");
                
                p.setNumProjeto(numProjeto);
                p.setFinanciador(financiador);
                p.setDtFim(dtFim);
                p.setDtInicio(dtInicio);
                p.setOrcamento(orcamento);
                p.setNumMatricula(numMatricula);
                p.setEstudantes(est);
                
            }
        }finally{
            cursor.close();
        }
        
        if(numProjeto == 0 && orcamento == 0 && numMatricula == 0){
            p = null;
        }
        
        return p;
    }
    
    public ArrayList<Integer> SelectRelacao(int num){
        ArrayList<Integer> est = new ArrayList<>();
        BasicDBObject query = new BasicDBObject("numProjeto", num);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("projetos");
        DBCursor cursor = coll.find(query);
        
        try{
            while(cursor.hasNext()){
                BasicDBObject pro = (BasicDBObject) cursor.next();
                est = (ArrayList<Integer>) pro.get("estudantes");
            }
        }finally{
            cursor.close();
        }
        
        return est;
    }
    
    public boolean Verifica(int num){
        int numProjeto;
        BasicDBObject query = new BasicDBObject("numProjeto", num);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("projetos");
        DBCursor cursor = coll.find(query);
        
        try{
            while(cursor.hasNext()){
                BasicDBObject prof = (BasicDBObject) cursor.next();
                numProjeto = prof.getInt("numProjeto");
                return true;
            }
        }finally{
            cursor.close();
        }
        return false;
    }
    
    public boolean VerificaRelacao(int numMat, int numProj){
        ArrayList<Integer> estudantes = new ArrayList<>();
        DB db = Conexao.getConnection();
        BasicDBObject query = new BasicDBObject("numProjeto", numProj);
        DBCollection coll = db.getCollection("projetos");
        DBCursor cursor = coll.find(query);
        
        try{ 
            while(cursor.hasNext()){
                BasicDBObject prof = (BasicDBObject) cursor.next();
                estudantes = (ArrayList<Integer>) prof.get("estudantes");
                
                for(int i = 0; i < estudantes.size(); i ++){
                    System.out.println("numMat "+ estudantes.get(i)+" numMat "+numMat);
                    if(estudantes.get(i) == numMat){
                        return false;  
                    }
                }
               
            }
        }finally{
            cursor.close();
        }
        return true;
    }
    
    public void Insert(int numProjeto, String financiador, Date dtInicio, Date dtFim, double orcamento, int numProf, ArrayList<Integer> estudantes, int numMat, int numMatProf) {
        ArrayList<Integer> professores = new ArrayList<>();
        professores.add(numMatProf);
        estudantes.add(numMat);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("projetos");
        DBObject data = new BasicDBObject();
        data.put("numProjeto", numProjeto); 
        data.put("financiador", financiador); 
        data.put("dtFim", dtFim);
        data.put("dtInicio", dtInicio);
        data.put("orcamento", orcamento);
        data.put("numMatricula", numProf);
        data.put("professores", professores);
        data.put("estudantes", estudantes);
        coll.insert(data);
        
    }
    
    public void InsertRelacao(int numMat, int numProj){
        Projetos p = new Projetos();
        p = Select(numProj);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("projetos");
        BasicDBObject query = new BasicDBObject();
        query.append("numProjeto", numProj);
        coll.remove(query);
        
        Insert(p.getNumProjeto(), p.getFinanciador(), p.getDtInicio(), p.getDtFim(), p.getOrcamento(), p.getNumMatricula(), p.getEstudantes(), numMat, 0);
    }

}
