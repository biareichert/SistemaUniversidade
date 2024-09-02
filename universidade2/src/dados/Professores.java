package dados;

import java.util.ArrayList;

public class Professores {
    private int numMatriculaProfessor;
    private String nome;
    private int idade;
    private int sala;
    private String especialidade;
    private ArrayList<Integer> projetos;
    private ArrayList<Integer> departamentos;

    public int getNumMatriculaProfessor() {
        return numMatriculaProfessor;
    }

    public void setNumMatriculaProfessor(int numMatriculaProfessor) {
        this.numMatriculaProfessor = numMatriculaProfessor;
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

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<Integer> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Integer> projetos) {
        this.projetos = projetos;
    }

    public ArrayList<Integer> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Integer> departamentos) {
        this.departamentos = departamentos;
    }
    
    
    
}
