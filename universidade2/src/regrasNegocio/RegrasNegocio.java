package regrasNegocio;

import dados.*;
import dao.*;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegrasNegocio {
    static RegrasNegocio instancia = null;
    
    private RegrasNegocio() throws Exception{
        init();
    }
    
    private void init() throws Exception{
        DepartamentosDAO d = new DepartamentosDAO();
        EstudantesDAO est = new EstudantesDAO();
        ProfessoresDAO prof = new ProfessoresDAO();
        ProjetosDAO proj = new ProjetosDAO();
    }
    //A interface chama as funções pesquisar, cujo essas retornam a busca do departamento
    public static Departamentos pesquisarDepartamento(int num){
        Departamentos d = DepartamentosDAO.getInstance().Select(num);
        return d;
    }
    
    public static Estudantes pesquisarEstudante(int num){
        Estudantes est = EstudantesDAO.getInstance().Select(num);
        return est;
    }
    
    public static Professores pesquisarProfessor(int num){
        Professores prof = ProfessoresDAO.getInstance().Select(num);
        return prof;
    }
    
    public static Projetos pesquisarProjeto(int num){
        Projetos proj = ProjetosDAO.getInstance().Select(num);
        return proj;
    }
    
    public static ArrayList<Integer> pesquisarRelacao(int num){
        ArrayList<Integer> proj = ProjetosDAO.getInstance().SelectRelacao(num);
        return proj;
    }
    
    public static String pesquisarNome(int num){
        String nome = EstudantesDAO.getInstance().SelectNome(num);
        return nome;
    }
    
    public static boolean inserirDepartamento(int numDep, String nome, int escritorio, int numProf) throws SQLException{
        DepartamentosDAO d = new DepartamentosDAO();
        boolean p = ProfessoresDAO.getInstance().Verifica(numProf);
        boolean dep = DepartamentosDAO.getInstance().Verifica(numDep);
        
        if(p && !dep){ 
            d.Insert(numDep, nome, escritorio, numProf);
            return true;
        }
        
        return false;
    }
    
    public static boolean inserirEstudante(int numMatricula, String nome, int idade, String curso, int aconselhador, int numDep) throws SQLException{
        EstudantesDAO d = new EstudantesDAO();
        ArrayList<Integer> a = new ArrayList<>();
        boolean est = EstudantesDAO.getInstance().Verifica(numMatricula);
        boolean acons = EstudantesDAO.getInstance().Verifica(aconselhador);
        boolean dep = DepartamentosDAO.getInstance().Verifica(numDep);
        boolean id = EstudantesDAO.getInstance().VerificaIdade(idade, aconselhador);
        
        if(!est && acons && dep && id){
            d.Insert(numMatricula,nome, idade, curso, aconselhador, numDep, a, 0);
            return true;
        }
        return false;
        
    }
    
    public static boolean inserirProfessor(int numMat, String nome, int idade, int sala, String especialidade) throws SQLException{
        ProfessoresDAO d = new ProfessoresDAO();
        boolean p = ProfessoresDAO.getInstance().Verifica(numMat);
        
        if(!p){ 
            d.Insert(numMat, nome, idade, sala, especialidade);
            return true;
        }
        
        return false;
    }
    
    public static boolean inserirProjeto(int numProjeto, String financiador, Date inicio, Date fim, float orcamento, int numProf) throws SQLException{
        ProjetosDAO d = new ProjetosDAO();
        ArrayList<Integer> a = new ArrayList<>();
        //a.add(0);
        boolean p = ProjetosDAO.getInstance().Verifica(numProjeto);
        boolean prof = ProfessoresDAO.getInstance().Verifica(numProf);
        
        if(!p && prof){
            d.Insert(numProjeto, financiador, inicio, fim, orcamento, numProf,a, 0, 0);
            return true;
        }
        return false;
        
    }
    
    public static boolean inserirRelacao(int numMat, int numProj){
        ProjetosDAO d = new ProjetosDAO();
        EstudantesDAO es = new EstudantesDAO();
        boolean e = ProjetosDAO.getInstance().VerificaRelacao(numMat, numProj);//verifica se o estudante ja esta no projeto
        boolean p = ProjetosDAO.getInstance().Verifica(numProj);
        boolean est = EstudantesDAO.getInstance().Verifica(numMat);
       // boolean p = EstudantesDAO.getInstance().VerificaRelacao(numMat, numProj);
        
        if(e && p && est){
            d.InsertRelacao(numMat, numProj);
            es.InsertRelacao(numMat, numProj);
            return true;
        }
        
        return false;
        
    }

}
