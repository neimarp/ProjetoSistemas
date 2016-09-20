
package Model;

import Persistencia.CursoDAO;
import java.io.Serializable;

public class Curso /*extends CursoDAO*/ implements Serializable{
    
    private int id;
    private String nome;
    private String regime;
    private String descricao;
    private int duracao;
    private String turno;
    private String sigla;
    private String areaConhecimento;
    private String grauInstrucao;

    public Curso(int id, String nome, String regime, String descricao, int duracao, String turno, String sigla, String areaConhecimento, String grauInstrucao) {
        this.id = id;
        this.nome = nome;
        this.regime = regime;
        this.descricao = descricao;
        this.duracao = duracao;
        this.turno = turno;
        this.sigla = sigla;
        this.areaConhecimento = areaConhecimento;
        this.grauInstrucao = grauInstrucao;
    }

    public Curso() {
    }
    //"id", "nome", "regime", "duracao","turno", "sigla" ,"nivel"
    public Curso(int parseInt, String string, String string0, int parseInt0, String string1, String string2, String string3) {
        id=parseInt;nome=string;regime=string0;duracao=parseInt0;turno=string1;sigla=string2;grauInstrucao=string3;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public String getGrauInstrucao() {
        return grauInstrucao;
    }

    public void setGrauInstrucao(String grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

    @Override
    public String toString() {
        return id+" "+nome+" "+regime+" "+duracao+" "+turno+" "+sigla+" "+grauInstrucao;
    }

    
}
