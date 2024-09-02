package dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import dados.Estudantes;
import dados.Professores;
import java.util.ArrayList;

public class EstudantesDAO {
    private static EstudantesDAO instance = null;
    
    public static EstudantesDAO getInstance(){
        if (instance == null)
            instance = new EstudantesDAO();
        return instance;
    }
    
    public EstudantesDAO(){
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("estudantes");
        
    }
    
    public Estudantes Select(int num){
        int numMatriculaEstudante = 0, idade = 0, numMatriculaEstudanteAconselhador = 0, numDep;
        String nome, curso;
        ArrayList<Integer> projetos = new ArrayList<>();
        BasicDBObject query = new BasicDBObject("numMatriculaEstudante", num);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("estudantes");
        DBCursor cursor = coll.find(query);
        
        Estudantes e = new Estudantes();
        try{
            while(cursor.hasNext()){
                BasicDBObject est = (BasicDBObject) cursor.next();
                numMatriculaEstudante = est.getInt("numMatriculaEstudante");
                nome = est.getString("nome");
                idade = est.getInt("idade");
                curso = est.getString("curso");
                numMatriculaEstudanteAconselhador = est.getInt("numMatriculaEstudanteAconselhador");
                numDep = est.getInt("numDepartamento");
                projetos = (ArrayList<Integer>) est.get("projetos");
                
                e.setNumMatriculaEstudante(numMatriculaEstudante);
                e.setNome(nome);
                e.setIdade(idade);
                e.setCurso(curso);
                e.setNumMatriculaEstudanteAconselhador(numMatriculaEstudanteAconselhador);
                e.setNumDepartamento(numDep);
                e.setProjetos(projetos);
            }
        }finally{
            cursor.close();
        }
        
        if(numMatriculaEstudante == 0 && idade == 0 && numMatriculaEstudanteAconselhador == 0){
            e = null;
        }
        return e;
    }
    
    public String SelectNome(int num){
        String nome;
        BasicDBObject query = new BasicDBObject("numMatriculaEstudante", num);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("estudantes");
        DBCursor cursor = coll.find(query);
        Estudantes e = new Estudantes();
        try{
            while(cursor.hasNext()){
                BasicDBObject est = (BasicDBObject) cursor.next();
                nome = est.getString("nome");
                return nome;
            }
        }finally{
            cursor.close();
        }
        return "";
    }
    
    public boolean Verifica(int num){
        int numMatriculaEstudante;
        BasicDBObject query = new BasicDBObject("numMatriculaEstudante", num);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("estudantes");
        DBCursor cursor = coll.find(query);
        Professores p = new Professores();
        try{
            while(cursor.hasNext()){
                BasicDBObject prof = (BasicDBObject) cursor.next();
                numMatriculaEstudante = prof.getInt("numMatriculaEstudante");
                return true;
            }
        }finally{
            cursor.close();
        }
        return false;
    }
    
    public boolean VerificaIdade(int idade, int aconselhador){
        int idadeA = 0;
        BasicDBObject query = new BasicDBObject("numMatriculaEstudante", aconselhador);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("estudantes");
        DBCursor cursor = coll.find(query);
        try{
            while(cursor.hasNext()){
                BasicDBObject prof = (BasicDBObject) cursor.next();
                idadeA = prof.getInt("idade");
                
            }
        }finally{
            cursor.close();
        }
        if(idade < idadeA){
            return true;
        }
        return false;
    }
    
    
    public void Insert(int numEstudante, String nome, int idade, String curso, int aconselhador, int numDep, ArrayList<Integer> projetos, int numProj){
        projetos.add(numProj);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("estudantes");
        DBObject data = new BasicDBObject();
        data.put("numMatriculaEstudante", numEstudante); 
        data.put("nome", nome); 
        data.put("idade", idade);
        data.put("curso", curso);
        data.put("numMatriculaEstudanteAconselhador", aconselhador);
        data.put("numDepartamento", numDep);
        data.put("projetos", projetos);
        coll.insert(data);
    }
    
    public void InsertRelacao(int numMat, int numProj){
        Estudantes p = new Estudantes();
        p = Select(numMat);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("estudantes");
        BasicDBObject query = new BasicDBObject();
        query.append("numMatriculaEstudante", numMat);
        coll.remove(query);
        //System.out.println("numMat "+p.getNumMatriculaEstudante());
        //System.out.println("nome "+p.getNome());
        Insert(p.getNumMatriculaEstudante(), p.getNome(), p.getIdade(), p.getCurso(), p.getNumMatriculaEstudanteAconselhador(), p.getNumDepartamento(), p.getProjetos(), numProj);
    }
}
