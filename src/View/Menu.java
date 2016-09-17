package View;

import Model.Curso;
import Persistencia.*;
import java.util.List;
import java.util.Scanner;

public class Menu extends AbstractMenu{
    
    public Menu(){
        
    }
    
    
    @Override
    public void load() {
        Scanner menuEntrada = new Scanner(System.in);
        int menu = -1;
     
        while (menu != 0) {
            limpaTela();
            System.out.println("1 - Cadastrar Curso");
            System.out.println("2 - Consultar Curso");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Excluir Curso");            
            System.out.println("0 - Sair");
            
            menu = menuEntrada.nextInt();
            switch (menu) {
                case 1:
                    popularCursos();
                    break;
                case 2:
                    consultarCursos();
                    break;
                case 3:
                    atualizarCurso();
                    break;
                case 4:
                    deletarCurso();
                    break;
                case 0:
                    return;
            }
        }
    }
    
    public void popularBanco(int qtd){
        System.out.println(this.messages.get("INICIANDO_POPULACAO"));
        
        popularCursos();
        
        System.out.println(this.messages.get("ENCERRANDO_POPULACAO"));    
    }
    
    public void popularCursos(){
        FormCadCurso form = new FormCadCurso();
        form.setVisible(true);
        
        //System.out.println("populando Curso");
        //cursoData.criaCursoRandom(df, qtd);
    }
    
    public void atualizarCurso(){
        FormAltCurso form = new FormAltCurso();
        form.setVisible(true);
        //form.setBuscarCurso();
    }
    public void listar(List<?> objects){
        for (Object object : objects) {
            System.out.println(object);
        }
    }

    public void deletarCurso() {
        FormExcluirCurso form = new FormExcluirCurso();
        form.setVisible(true);
    }

    void consultarCursos() {
        CursoDAO dao = new CursoDAO();
        dao.selecionarTodos();
    }
    
    String consultarAllCursos() {
        CursoDAO dao = new CursoDAO();
        
        String msn = new String();
        for(Curso lc:(List<Curso>)dao.selecionarTodos()){
            //System.out.println(lc);
            msn+=lc.toString()+"\n";
        }
        
        return msn;
    }

}
