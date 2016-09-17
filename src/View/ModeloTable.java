
package View;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.event.TableModelListener;

/**
 *
 * @author Neimarp
 */
public class ModeloTable extends AbstractTableModel{
    private List linhas = null;
    private String[] colunas =null;

    public ModeloTable(List lin,String[] col) {
        setLinhas(lin);
        setColunas(col);
    }

    public List getLinhas() {
        return linhas;
    }

    public void setLinhas(List linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    public int getColumnCount(){
        return colunas.length;
    }
    
    public int getRowCount(){
        return linhas.size();
    }
    
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
}
