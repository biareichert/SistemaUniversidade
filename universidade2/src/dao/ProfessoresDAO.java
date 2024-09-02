package dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import dados.Professores;
import java.util.ArrayList;

public class ProfessoresDAO {
    private static ProfessoresDAO instance = null;
    
    public static ProfessoresDAO getInstance(){
        if (instance == null){
            instance = new ProfessoresDAO();
        }
        return instance;
    }
    
    public ProfessoresDAO(){
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("professores");
    }
    
    public Professores Select(int num){
        int numMatriculaProfessor = 0, idade = 0, sala = 0;
        String nome, especialidade;
        BasicDBObject query = new BasicDBObject("numMatriculaProfessor", num);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("professores");
        DBCursor cursor = coll.find(query);
        
        Professores p = new Professores();
        try{
            while(cursor.hasNext()){
                BasicDBObject prof = (BasicDBObject) cursor.next();
                numMatriculaProfessor = prof.getInt("numMatriculaProfessor");
                nome = prof.getString("nome");
                idade = prof.getInt("idade");
                sala = prof.getInt("sala");
                especialidade = prof.getString("especialidade");
                
                p.setNumMatriculaProfessor(numMatriculaProfessor);
                p.setNome(nome);
                p.setIdade(idade);
                p.setSala(sala);
                p.setEspecialidade(especialidade);
            }
        }finally{
            cursor.close();
        }
        
        if(numMatriculaProfessor == 0 && idade == 0 && sala == 0){
            p = null;
        }
        
        return p;
    }
    
    public boolean Verifica(int num){
        int numMatriculaProfessor;
        BasicDBObject query = new BasicDBObject("numMatriculaProfessor", num);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("professores");
        DBCursor cursor = coll.find(query);
        Professores p = new Professores();
        try{
            while(cursor.hasNext()){
                BasicDBObject prof = (BasicDBObject) cursor.next();
                numMatriculaProfessor = prof.getInt("numMatriculaProfessor");
                return true;
            }
        }finally{
            cursor.close();
        }
        return false;
    }
    
    public void Insert(int numMatricula, String nome, int idade, int sala, String especialidade){
        ArrayList<Integer> projetos = new ArrayList<>();
        ArrayList<Integer> departamentos = new ArrayList<>();
        projetos.add(0);
        departamentos.add(0);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("professores");
        DBObject data = new BasicDBObject();
        data.put("numMatriculaProfessor", numMatricula); 
        data.put("nome", nome); 
        data.put("idade", idade);
        data.put("sala", sala);
        data.put("especialidade", especialidade);
        data.put("projetos", projetos);
        data.put("departamentos", departamentos);
        coll.insert(data);
    }
}
