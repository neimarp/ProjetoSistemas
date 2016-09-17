package View;

import Model.Curso;
import java.util.Scanner;

public class MenuCadastro extends AbstractMenu{

    public MenuCadastro() {
        load();
    }

    
    @Override
    public void load() {
        FormCadCurso cadCurso = new  FormCadCurso();
        cadCurso.setVisible(true);
        /*
        Scanner menuEntrada = new Scanner(System.in);
        int menu = -1;
     
        while (menu != 0) {
            limpaTela();
            System.out.println("1 - Cadastrar Curso");
            
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Cadastrar Aluno");
            System.out.println("4 - Cadastrar Disciplina");
            System.out.println("5 - Cadastrar Horario");
            System.out.println("6 - Cadastrar Calendario");
            System.out.println("0 - Retorna Menu Principal");
            
            menu = menuEntrada.nextInt();
            switch (menu) {
                case 1:
                    
                    //cadastrarCurso(lerCurso());
                    //imprimeMensagem("Curso", "inserir");
                    break;
                case 0:
                    return;
            }
        }
        */
    }
    private void cadastrarCurso(Curso curso) {
        curso.inserir(curso);
    }
}
