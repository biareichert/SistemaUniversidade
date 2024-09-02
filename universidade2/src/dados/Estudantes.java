package dados;

import java.util.ArrayList;

public class Estudantes {
    private int numMatriculaEstudante;
    private String nome;
    private int idade;
    private String curso;
    private int numMatriculaEstudanteAconselhador;
    private int numDepartamento;
    private ArrayList<Integer> projetos;

    public int getNumMatriculaEstudante() {
        return numMatriculaEstudante;
    }

    public void setNumMatriculaEstudante(int numMatriculaEstudante) {
        this.numMatriculaEstudante = numMatriculaEstudante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumMatriculaEstudanteAconselhador() {
        return numMatriculaEstudanteAconselhador;
    }

    public void setNumMatriculaEstudanteAconselhador(int numMatriculaEstudanteAconselhador) {
        this.numMatriculaEstudanteAconselhador = numMatriculaEstudanteAconselhador;
    }

    public int getNumDepartamento() {
        return numDepartamento;
    }

    public void setNumDepartamento(int numDepartamento) {
        this.numDepartamento = numDepartamento;
    }

    public ArrayList<Integer> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Integer> projetos) {
        this.projetos = projetos;
    }
    
    
}
