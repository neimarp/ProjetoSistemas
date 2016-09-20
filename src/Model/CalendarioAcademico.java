
package Model;

import java.io.Serializable;
import java.util.Date;

public class CalendarioAcademico implements Serializable{
    
    private int id;
    private String situacao;
    private int duracao;
    private Date dataInicioPM;
    private Date dataFimPM;
    private Date dataInicioCA;
    private Date dataFimCA;
    private Date dataInicioPL;
    private Date dataFimPL;
    private Curso id_curso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Date getDataInicioPM() {
        return dataInicioPM;
    }

    public void setDataInicioPM(Date dataInicioPM) {
        this.dataInicioPM = dataInicioPM;
    }

    public Date getDataFimPM() {
        return dataFimPM;
    }

    public void setDataFimPM(Date dataFimPM) {
        this.dataFimPM = dataFimPM;
    }

    public Date getDataInicioCA() {
        return dataInicioCA;
    }

    public void setDataInicioCA(Date dataInicioCA) {
        this.dataInicioCA = dataInicioCA;
    }

    public Date getDataFimCA() {
        return dataFimCA;
    }

    public void setDataFimCA(Date dataFimCA) {
        this.dataFimCA = dataFimCA;
    }

    public Date getDataInicioPL() {
        return dataInicioPL;
    }

    public void setDataInicioPL(Date dataInicioPL) {
        this.dataInicioPL = dataInicioPL;
    }

    public Date getDataFimPL() {
        return dataFimPL;
    }

    public void setDataFimPL(Date dataFimPL) {
        this.dataFimPL = dataFimPL;
    }

    public Curso getId_curso() {
        return id_curso;
    }

    public void setId_curso(Curso id_curso) {
        this.id_curso = id_curso;
    }
    
    
}
