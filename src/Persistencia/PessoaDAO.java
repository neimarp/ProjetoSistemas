package Persistencia;

import Model.Pessoa;
import java.util.List;

public class PessoaDAO extends DAO{
    public void inserir(Object obj) {
        inserir(obj, Pessoa.class);
    }

    
    public void atualizar(Object obj) {
        atualizar(obj, Pessoa.class);
    }

    public void deletar(Object obj) {
        deletar(obj, Pessoa.class);
    }

    public void deletar(int id) {
        deletar(id, Pessoa.class);
    }
    
    public List<Pessoa> selecionarTodos() {
        return (List<Pessoa>) selecionarTodos(Pessoa.class);
    }

    public Pessoa selecionar(int id) {
        return (Pessoa) selecionar(id, Pessoa.class);
    }
    
}
