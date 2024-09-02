package dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
	
    static public DB getConnection(){
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE); 
        MongoClient mongoClient = new MongoClient("localhost",27017);
        List<String> databases = mongoClient.getDatabaseNames();
        DB db = mongoClient.getDB("universidade");
        //DBCollection coll = db.getCollection("nomeTabela");
        return db;
    }
}
