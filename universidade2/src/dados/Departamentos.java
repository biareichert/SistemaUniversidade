package dados;

import java.util.ArrayList;

public class Departamentos {
    private int numDepartamento;
    private String nome;
    private int escritorio;
    private int numMatriculaProfessor;
    private ArrayList<Integer> professores;    

    public int getNumDepartamento() {
        return numDepartamento;
    }

    public void setNumDepartamento(int numDepartamento) {
        System.out.println("set "+numDepartamento);
        this.numDepartamento = numDepartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(int escritorio) {
        this.escritorio = escritorio;
    }

    public int getNumMatriculaProfessor() {
        return numMatriculaProfessor;
    }

    public void setNumMatriculaProfessor(int numMatriculaProfessor) {
        this.numMatriculaProfessor = numMatriculaProfessor;
    }

    public ArrayList<Integer> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Integer> professores) {
        this.professores = professores;
    }
    
    
}
