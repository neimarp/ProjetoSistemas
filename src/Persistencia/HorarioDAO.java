package Persistencia;

import Model.Horario;
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

public class HorarioDAO extends DAO{
    public void inserir(Object obj) {
        inserir(obj, Horario.class);
    }

    
    public void atualizar(Object obj) {
        atualizar(obj, Horario.class);
    }

    public void deletar(Object obj) {
        deletar(obj, Horario.class);
    }

    public void deletar(int id) {
        deletar(id, Horario.class);
    }
    
    public List selecionarTodos() {
        //return (List<Curso>) selecionarTodos(Curso.class);
        List<Horario> l = new LinkedList();
        conectar();
        Connection con = getCONEXAO();
        PreparedStatement pst;
        try {
            //logica de insercao
            //"id", id_turma, diaSemana, horarioInicio, horarioFim
            String sql = "select * from horario";
            
            stm = con.prepareStatement(sql);
            stm.executeQuery(sql);
            rs=stm.getResultSet();
            
            while(rs.next()){
                
                l.add(new Horario(Integer.parseInt(rs.getString("id_horario")), Integer.parseInt(rs.getString("id_turma")),rs.getString("diaSemana"),Date.valueOf(rs.getString("horarioInicio")),Date.valueOf(rs.getString("horarioFim"))));
                
                //System.out.println(rs.getString("id_curso")+" "+rs.getString("nome"));
            }
            for(Horario lc:l){System.out.println(lc);}
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar banco de dados:\n " + ex);
            //Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        desconectar();
        return l;
    }

    public Horario selecionar(int id) {
        return (Horario) selecionar(id, Horario.class);
    }
    
}
