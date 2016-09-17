package Persistencia;

import Model.CalendarioAcademico;
import java.util.List;

public class CalendarioAcademicoDAO extends DAO{
    public void inserir(Object obj) {
        inserir(obj, CalendarioAcademico.class);
    }

    
    public void atualizar(Object obj) {
        atualizar(obj, CalendarioAcademico.class);
    }

    public void deletar(Object obj) {
        deletar(obj, CalendarioAcademico.class);
    }

    public void deletar(int id) {
        deletar(id, CalendarioAcademico.class);
    }
    
    public List<CalendarioAcademico> selecionarTodos() {
        return (List<CalendarioAcademico>) selecionarTodos(CalendarioAcademico.class);
    }

    public CalendarioAcademico selecionar(int id) {
        return (CalendarioAcademico) selecionar(id, CalendarioAcademico.class);
    }
    
}
