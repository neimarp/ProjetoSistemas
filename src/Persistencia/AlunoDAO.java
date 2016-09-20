package Persistencia;

import Model.Aluno;
import static Persistencia.Conexao.conectar;
import static Persistencia.Conexao.desconectar;
import static Persistencia.Conexao.getCONEXAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class AlunoDAO extends DAO{
    public void inserir(Aluno obj) {
        //inserir(obj, Aluno.class);
        conectar();
        Connection con = getCONEXAO();
        PreparedStatement pst;
        try {
            //logica de insercao
            
            String sql = "insert into aluno (nome, nomePai, nomeMae,cpf,situacao)values(?,?,?,?,?)";
            pst=con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getNomePai());
            pst.setString(3, obj.getNomeMae());
            pst.setInt(4, obj.getCpf());
            pst.setString(5, obj.getSituacao());
            
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "cadastro feito com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados do curso Statement:\n " + ex);
            //Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        desconectar();
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
