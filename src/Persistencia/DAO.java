package Persistencia;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class DAO extends Conexao {

    public void inserir(Object obj, Class c) {
        conectar();
        Connection con = getCONEXAO();
        try {
            //logica de insercao
            this.stm=con.prepareStatement("sql");
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.cast(obj);
        desconectar();
    }
    
    public void atualizar(Object obj, Class c) {
        
    }
    
    public void deletar(int id, Class c) {
        
    }

    public void deletar(Object obj, Class c) {
        
    }

    public List<?> selecionarTodos(Class c){        
        List listObj = new ArrayList();        
        
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       return listObj;
    }
    
    public List<?> selecionar(Class c, Field f, String value){
        List listObj = new ArrayList();
        
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listObj;
    }
    
    public List<?> selecionar(Class c, Object o){
        List listObj = new ArrayList();
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listObj;        
    }
    
    public Object selecionar(int id, Class c) {
        Object o = null;
        try {

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
}

