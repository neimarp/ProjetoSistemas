package Persistencia;

import Model.Curso;
import static Persistencia.Conexao.conectar;
import static Persistencia.Conexao.getCONEXAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class CursoDAO extends DAO{
    public void inserirHibanete(Curso obj) {
        //inserir(obj, Curso.class);
        inserir(obj);
        //inserirNaUnha(obj);
        
    }
    
    public void inserir(Curso obj){
        conectar();
        Connection con = getCONEXAO();
        PreparedStatement pst;
        try {
            //logica de insercao
            
            String sql = "insert into curso (nome, regime, descricao,duracao,turno, sigla,areaConhecimento,grauInstrucao)values(?,?,?,?,?,?,?,?)";
            pst=con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getRegime());
            pst.setString(3, obj.getDescricao());
            pst.setInt(4, obj.getDuracao());
            pst.setString(5, obj.getTurno());
            pst.setString(6, obj.getSigla());
            pst.setString(7, obj.getAreaConhecimento());
            pst.setString(8, obj.getGrauInstrucao());
            
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "cadastro feito com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados do curso Statement:\n " + ex);
            //Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        desconectar();
    }
    
    
    
    public void atualizar(Curso obj) {
        //atualizar(obj, Curso.class);
        conectar();
        Connection con = getCONEXAO();
        PreparedStatement pst;
        try {
            //logica de insercao
            
            String sql = "update curso set nome=?, regime=?,descricao=?,duracao=?,"+
             "turno=?, sigla=?,areaConhecimento=?,grauInstrucao=? where id_curso=?";
            //String sql = "update curso set (nome, regime, descricao,duracao,turno, sigla,areaConhecimento,grauInstrucao)values(?,?,?,?,?,?,?,?) where id_curso="+obj.getId();
            pst=con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getRegime());
            pst.setString(3, obj.getDescricao());
            pst.setInt(4, obj.getDuracao());
            pst.setString(5, obj.getTurno());
            pst.setString(6, obj.getSigla());
            pst.setString(7, obj.getAreaConhecimento());
            pst.setString(8, obj.getGrauInstrucao());
            pst.setInt(9, obj.getId());
            
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "atualizacao no curso "+obj.getNome()+" feito com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados do curso :\n " + ex);
            //Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        desconectar();
    }
      

    public void deletar(Object obj) {
        deletar(obj, Curso.class);
    }

    public void deletar(Curso curso) {
        conectar();
        Connection con = getCONEXAO();
        PreparedStatement pst;
        try {
            String sql ="delete from curso where id_curso=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, curso.getId());
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Curso: "+curso.getNome()+" excluido com sucesso\n ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir curso :\n " + ex);
     }
    }
    
    public List selecionarTodos() {
        //return (List<Curso>) selecionarTodos(Curso.class);
        List<Curso> l = new LinkedList();
        conectar();
        Connection con = getCONEXAO();
        //PreparedStatement pst;
        try {
            //logica de insercao
            //"id", "nome", "regime", "duracao","turno", "sigla" ,"nivel"
            String sql = "select id_curso, nome, regime, duracao, turno, sigla , grauInstrucao from curso";
            
            stm = con.prepareStatement(sql);
            stm.executeQuery(sql);
            rs=stm.getResultSet();
            
            while(rs.next()){
                
                l.add(new Curso(Integer.parseInt(rs.getString("id_curso")),rs.getString("nome"),rs.getString("regime"),Integer.parseInt(rs.getString("duracao")),rs.getString("turno"),rs.getString("sigla"),rs.getString("grauInstrucao")));
                
                //System.out.println(rs.getString("id_curso")+" "+rs.getString("nome"));
            }
            rs.close();
            stm.close();
            //for(Curso lc:l){System.out.println(lc);}
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar banco de dados:\n " + ex);
            //Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        desconectar();
        return l;
    }

    public Curso selecionar(int id) {
        //return (Curso) selecionar(id, Curso.class);
        Curso curso = new Curso();
        conectar();
        Connection con = getCONEXAO();
        PreparedStatement pst;
        try {
            //logica de busca
            //"id", "nome", "regime", "duracao","turno", "sigla" ,"nivel"
            
            String sql = "select * from curso where id_curso="+id;
            //sql.concat(idc);
            stm = con.prepareStatement(sql);
            stm.executeQuery(sql);
            rs=stm.getResultSet();
            while(rs.next()){
                curso.setId(id);
                curso.setNome(rs.getString("nome"));
                curso.setRegime(rs.getString("regime"));
                curso.setDescricao(rs.getString("descricao"));
                curso.setDuracao(Integer.parseInt(rs.getString("duracao")));
                curso.setTurno(rs.getString("turno"));
                curso.setSigla(rs.getString("sigla"));
                curso.setAreaConhecimento(rs.getString("areaConhecimento"));
                curso.setGrauInstrucao(rs.getString("grauInstrucao"));
            }
            rs.close();
            stm.close();
            //System.out.println(curso);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar BD em selecionar():\n " + ex);
            //Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(curso);
        }
        
        desconectar();
        return curso;
    }
    
    public int quantidadeCursosBD(){
        return selecionarTodos().size();
    }
    
    private void inserirNaUnha(Curso obj){
        conectar();
        Connection con = getCONEXAO();
        PreparedStatement pst;
        
        try {
                
               
               String consulta = 
                        "INSERT INTO curso (nome, sigla,regime, duracao, descricao, areaConhecimento,turno, grauInstrucao) VALUES ('" 
                        
                        + obj.getNome() + "','"
                        + obj.getSigla() + "','"
                        + obj.getRegime() + "','"
                        + obj.getDuracao() + "','"
                        + obj.getDescricao() + "','"
                        + obj.getAreaConhecimento() + "','"
                        + obj.getTurno() + "','"
                        + obj.getGrauInstrucao() + "' );";
                
               pst = con.prepareStatement(consulta);
               pst.execute(consulta);
 
          
            
            pst.close();
            desconectar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados do curso na Unha:\n " + ex);
            //Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void atualizar1(Curso obj) {
        //atualizar(obj, Curso.class);
        conectar();
        Connection con = getCONEXAO();
        try {
            //logica de insercao
            
            String sql = "update curso set nome=?, regime=?,descricao=?,duracao=?,"+
             "turno=?, sigla=?,areaConhecimento=?,grauInstrucao=? where id_curso=?";
            //String sql = "update curso set (nome, regime, descricao,duracao,turno, sigla,areaConhecimento,grauInstrucao)values(?,?,?,?,?,?,?,?) where id_curso="+obj.getId();
            stm = con.prepareStatement(sql);
            
            rs=stm.getResultSet();
            while(rs.next()){
                rs.updateNString(1, obj.getNome());
                rs.updateNString(2, obj.getRegime());
                rs.updateNString(3, obj.getDescricao());
                rs.updateInt(4, obj.getDuracao());
                rs.updateNString(5, obj.getTurno());
                rs.updateNString(6, obj.getSigla());
                rs.updateNString(7, obj.getAreaConhecimento());
                rs.updateNString(8, obj.getGrauInstrucao());
                rs.updateInt(9, obj.getId());
            }
            stm.executeQuery(sql);
            rs.close();
            stm.close();
            JOptionPane.showMessageDialog(null, "atualizacao no curso "+obj.getNome()+" feito com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados do curso :\n " + ex);
            //Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        desconectar();
    }
}
