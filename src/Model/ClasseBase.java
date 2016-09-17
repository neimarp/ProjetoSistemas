
package Model;

import Persistencia.TurmaDAO;
import java.io.Serializable;
import java.util.HashMap;
public class ClasseBase extends TurmaDAO implements Serializable{
    
    private int id;
    private String situacao;
    private int id_calendario;
    
}
