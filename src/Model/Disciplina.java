
package Model;

import java.io.Serializable;
import java.util.ArrayList;
public class Disciplina implements Serializable{
    
    private int id;
    private ArrayList<Disciplina> preRequisito;
    private String nome;
    private String areaDisciplina;
    private int numCreditos;
    private int cargaHoraria;
    private int periodoCorrespondente;
    private Curso id_curso;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Disciplina> getPreRequisito() {
        return preRequisito;
    }

    public void setPreRequisito(ArrayList<Disciplina> preRequisito) {
        this.preRequisito = preRequisito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaDisciplina() {
        return areaDisciplina;
    }

    public void setAreaDisciplina(String areaDisciplina) {
        this.areaDisciplina = areaDisciplina;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getPeriodoCorrespondente() {
        return periodoCorrespondente;
    }

    public void setPeriodoCorrespondente(int periodoCorrespondente) {
        this.periodoCorrespondente = periodoCorrespondente;
    }
    
    
}
