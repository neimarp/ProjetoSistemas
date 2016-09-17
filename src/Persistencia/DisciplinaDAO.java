package Persistencia;

import Model.Disciplina;
import java.util.List;

public class DisciplinaDAO extends DAO{
    public void inserir(Object obj) {
        inserir(obj, Disciplina.class);
    }

    
    public void atualizar(Object obj) {
        atualizar(obj, Disciplina.class);
    }

    public void deletar(Object obj) {
        deletar(obj, Disciplina.class);
    }

    public void deletar(int id) {
        deletar(id, Disciplina.class);
    }
    
    public List<Disciplina> selecionarTodos() {
        return (List<Disciplina>) selecionarTodos(Disciplina.class);
    }

    public Disciplina selecionar(int id) {
        return (Disciplina) selecionar(id, Disciplina.class);
    }
    
}
