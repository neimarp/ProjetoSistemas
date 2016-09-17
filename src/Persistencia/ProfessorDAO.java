package Persistencia;

import Model.Professor;
import java.util.List;

public class ProfessorDAO extends DAO{
    public void inserir(Object obj) {
        inserir(obj, Professor.class);
    }

    
    public void atualizar(Object obj) {
        atualizar(obj, Professor.class);
    }

    public void deletar(Object obj) {
        deletar(obj, Professor.class);
    }

    public void deletar(int id) {
        deletar(id, Professor.class);
    }
    
    public List<Professor> selecionarTodos() {
        return (List<Professor>) selecionarTodos(Professor.class);
    }

    public Professor selecionar(int id) {
        return (Professor) selecionar(id, Professor.class);
    }
    
}
