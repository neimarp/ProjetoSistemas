package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


//20141bsi0612
public class Conexao {
    
    private static final String USUARIO = "root";
    private static final String SENHA = "usbw";
    private static final String URL = "jdbc:mysql://localhost:3307/academico";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static Connection CONEXAO;
    public Statement stm; //responsável por fazer a consulta no BD
    public ResultSet rs;//Armazena o resultado da pesquisa

    public static Connection getCONEXAO() {
        return CONEXAO;
    }
    
    

    // Conectar ao banco
    public static void conectar() {
        try {
            // Registrar o driver
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no DRIVER:\n "+ex.getMessage());
            //Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            // Capturar a conexão
            CONEXAO = DriverManager.getConnection(URL, USUARIO, SENHA);
            // Retorna a conexao aberta
            //CONEXAO = conn;
            //return conn;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao:\n "+ex.getMessage());
            //Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    
    //fechar conexao com banco
    public static void desconectar(){
        try {
            CONEXAO.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encerrar conexao:\n "+ex.getMessage());
            //Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void executeSql(String sql)
    {
        try {
            stm = CONEXAO.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no executaSQL:\n "+ex.getMessage());
        }
    }
    
}
