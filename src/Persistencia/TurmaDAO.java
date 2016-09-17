package Persistencia;

import Model.Turma;
import java.util.List;

public class TurmaDAO extends DAO{
    public void inserir(Object obj) {
        inserir(obj, Turma.class);
    }

    
    public void atualizar(Object obj) {
        atualizar(obj, Turma.class);
    }

    public void deletar(Object obj) {
        deletar(obj, Turma.class);
    }

    public void deletar(int id) {
        deletar(id, Turma.class);
    }
    
    public List<Turma> selecionarTodos() {
        return (List<Turma>) selecionarTodos(Turma.class);
    }

    public Turma selecionar(int id) {
        return (Turma) selecionar(id, Turma.class);
    }
    
}
