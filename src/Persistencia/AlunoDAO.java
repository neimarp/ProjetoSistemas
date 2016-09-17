package Persistencia;

import Model.Aluno;
import java.util.List;

public class AlunoDAO extends DAO{
    public void inserir(Object obj) {
        inserir(obj, Aluno.class);
    }

    
    public void atualizar(Object obj) {
        atualizar(obj, Aluno.class);
    }

    public void deletar(Object obj) {
        deletar(obj, Aluno.class);
    }

    public void deletar(int id) {
        deletar(id, Aluno.class);
    }
    
    public List<Aluno> selecionarTodos() {
        return (List<Aluno>) selecionarTodos(Aluno.class);
    }

    public Aluno selecionar(int id) {
        return (Aluno) selecionar(id, Aluno.class);
    }
    
}
