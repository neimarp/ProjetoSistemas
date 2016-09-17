
package Model;

import Persistencia.TurmaDAO;
import java.io.Serializable;
public class Teste extends TurmaDAO implements Serializable{
    
    private int id;
    private String nome;

    public Teste(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return id+" "+nome;
    }
}
