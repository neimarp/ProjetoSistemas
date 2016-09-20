
package Model;

import java.io.Serializable;
import java.util.Date;

public class Horario implements Serializable{
    
    private int id;
    private int id_turma;
    private String diaSemana;
    private Date horarioInicio;
    private Date horarioFim;

    public Horario(int id, int id_turma, String diaSemana, Date horarioInicio, Date horarioFim) {
        this.id = id;
        this.id_turma = id_turma;
        this.diaSemana = diaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    @Override
    public String toString() {
        return id+" "+id_turma+" "+diaSemana+" "+horarioInicio+" "+horarioFim;
    }
    
    
    
}
