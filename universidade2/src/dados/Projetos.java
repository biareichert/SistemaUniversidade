package dados;

import java.util.Date;
import java.util.ArrayList;

public class Projetos {
    private int numProjeto;
    private String financiador;
    private Date dtFim;
    private Date dtInicio;
    private double orcamento;
    private int numMatricula;
    private ArrayList<Integer> professores;
    private ArrayList<Integer> estudantes;

    public int getNumProjeto() {
        return numProjeto;
    }

    public void setNumProjeto(int numProjeto) {
        this.numProjeto = numProjeto;
    }

    public String getFinanciador() {
        return financiador;
    }

    public void setFinanciador(String financiador) {
        this.financiador = financiador;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public ArrayList<Integer> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Integer> professores) {
        this.professores = professores;
    }

    public ArrayList<Integer> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Integer> estudantes) {
        this.estudantes = estudantes;
    }
    
    
}
