package app;

import View.FormMenuCrud;
import View.Menu;


 
public class App {

    public static void main(String[] args) {       
        
        //Menu menu = new Menu();
        //menu.load();
        FormMenuCrud crud = new FormMenuCrud();
        crud.setVisible(true);
       
    }
}
