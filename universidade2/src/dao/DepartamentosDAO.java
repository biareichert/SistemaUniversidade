package dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import dados.Departamentos;
import dados.Professores;
import java.util.ArrayList;

public class DepartamentosDAO {
    private static DepartamentosDAO instance = null;
    
    public static DepartamentosDAO getInstance(){
        if (instance == null){
            instance = new DepartamentosDAO();
        }
        return instance;
        
    }
    
    public DepartamentosDAO(int numDep, String nome, int esc, int numProf){
        
    }
    
    public DepartamentosDAO(){
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("departamentos");
        
    }
    
    public Departamentos Select(int num){
        int numDep = 0, escritorio = 0, numMatriculaProfessor = 0;
        String nome = null;
        BasicDBObject query = new BasicDBObject("numDepartamento", num);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("departamentos");
        DBCursor cursor = coll.find(query);
        
        Departamentos d = new Departamentos();
        
        try{
            while(cursor.hasNext()){
                BasicDBObject dep = (BasicDBObject) cursor.next();
                numDep = dep.getInt("numDepartamento");
                nome = dep.getString("nome");
                escritorio = dep.getInt("escritorio");
                numMatriculaProfessor = dep.getInt("numMatriculaProfessor");
                
                d.setNumDepartamento(numDep);
                d.setNome(nome);
                d.setEscritorio(escritorio);
                d.setNumMatriculaProfessor(numMatriculaProfessor);
                
            }
        }finally{
            cursor.close();
        }
        
        if(numDep == 0 && escritorio == 0 && numMatriculaProfessor == 0){
            d = null;
        }
        
        return d;
       
    }
    
    public boolean Verifica(int num){
        int numDep;
        BasicDBObject query = new BasicDBObject("numDepartamento", num);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("departamentos");
        DBCursor cursor = coll.find(query);
        Professores p = new Professores();
        try{
            while(cursor.hasNext()){
                BasicDBObject prof = (BasicDBObject) cursor.next();
                numDep = prof.getInt("numDepartamento");
                return true;
            }
        }finally{
            cursor.close();
        }
        return false;
    }
    
    
    public void Insert(int numDepartamento, String nome, int escritorio, int numProfessor){
        ArrayList<Integer> professores = new ArrayList<>();
        professores.add(0);
        DB db = Conexao.getConnection();
        DBCollection coll = db.getCollection("departamentos");
        DBObject data = new BasicDBObject();
        data.put("numDepartamento", numDepartamento); 
        data.put("nome", nome); 
        data.put("escritorio", escritorio);
        data.put("numMatriculaProfessor", numProfessor);
        data.put("professores", professores);
        coll.insert(data);
        
    }
    
}
