package Persistencia;

import Model.Teste;
import static Persistencia.Conexao.conectar;
import static Persistencia.Conexao.desconectar;
import static Persistencia.Conexao.getCONEXAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
//mport java.util.Date;

public class TesteDAO extends DAO{
    public void inserir(Object obj) {
        inserir(obj, Teste.class);
    }

    
    public void atualizar(Object obj) {
        atualizar(obj, Teste.class);
    }

    public void deletar(Object obj) {
        deletar(obj, Teste.class);
    }

    public void deletar(int id) {
        deletar(id, Teste.class);
    }
    
    public List selecionarTodos() {
        //return (List<Curso>) selecionarTodos(Curso.class);
        List<Teste> l = new LinkedList();
        conectar();
        Connection con = getCONEXAO();
        PreparedStatement pst;
        try {
            //logica de insercao
            //"id", nome
            String sql = "select * from teste";
            
            stm = con.prepareStatement(sql);
            stm.executeQuery(sql);
            rs=stm.getResultSet();
            
            while(rs.next()){
                
                l.add(new Teste(Integer.parseInt(rs.getString("id")),rs.getString("nome")));
                
                //System.out.println(rs.getString("id_curso")+" "+rs.getString("nome"));
            }
            for(Teste lc:l){System.out.println(lc);}
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar banco de dados:\n " + ex);
            //Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        desconectar();
        return l;
    }

    public Teste selecionar(int id) {
        return (Teste) selecionar(id, Teste.class);
    }
    
}
