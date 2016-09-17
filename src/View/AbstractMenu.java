
package View;

import java.io.IOException;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.springframework.beans.PropertyAccessor;
//import org.springframework.beans.PropertyAccessorFactory;
import util.DateValidator;

public abstract class AbstractMenu {
    DateValidator dateValidator = new DateValidator();
    HashMap<String, String> messages = new HashMap<>();

    public AbstractMenu() {
        
        this.messages.put("NOME", "Nome: ");
        this.messages.put("ID", "Id: ");
        this.messages.put("DATACRIACAO", "Data (dd/MM/yyyy): ");
        this.messages.put("DATANASCIMENTO", "Data (dd/MM/yyyy): ");
        this.messages.put("ENDERECO", "Endereco: ");
        this.messages.put("MENSALIDADESOCIO", "Mensalidade (Ex: 1.99): ");
        
        
        this.messages.put("SUCESSO_INSERIR", "\n%1$s Inserido com sucesso\n");
        this.messages.put("SUCESSO_DELETAR", "\n%1$s Excluido com sucesso\n");
        this.messages.put("SUCESSO_ATUALIZAR", "\n%1$s Atualizado com sucesso\n");
        this.messages.put("INICIANDO_POPULACAO", "Iniciando População do Banco...\n");
        this.messages.put("ENCERRANDO_POPULACAO", "...Encerrando População do Banco\n\nBanco Populado com Sucesso!\n");
        this.messages.put("TIME_REQUIRIDO", "\nEscolha um dos seguintes times:\n");
    }
    
    
    abstract public void load();
    //funcoes para limpar tela
    protected void limpaTela(){
        try {
            String path = "cmd /C:/Users/Neimarp/Desktop/BSI/2016-1/POO_2/Trab/AppCrud/src/main/java/util limpa.bat";
            Runtime.getRuntime().exec(path);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void limpaConsole(){

        try{
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");

            }else{
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e){
        //  Tratar Exceptions
        }
    }
    
    protected void limpaTelaEstiloJava(){
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
    // funcoes advindas de Menu:
    
    protected int lerInt() {
        System.out.println(this.messages.get("ID"));
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        return id;
    }
    
    protected void imprimeMensagem(String objeto, String operacao){
        operacao = operacao.toUpperCase();
        System.out.println(String.format(this.messages.get("SUCESSO_"+operacao),objeto));
    }
    
    private Object scanSpecific(String fieldName, Scanner sc, Class c) throws NoSuchFieldException{
        
        Field field = c.getDeclaredField(fieldName);
        boolean valid = false;
        Object value = null;
        
        while(!valid){
            System.out.println(this.messages.get(fieldName.toUpperCase()));
            String type = field.getType().getSimpleName();

            switch (type.toUpperCase()) {
                case "STRING":
                    value = sc.nextLine();
                    valid = true;
                    break;
                case "DATE":
                    String date = sc.nextLine();
                    valid = this.dateValidator.validate(date);
                    if(valid)
                        value = convertStringToDate(date);
                    break;
                case "INT":
                    value = sc.nextInt();
                    valid = true;
                    break;
                case "FLOAT":
                    value = sc.nextFloat();
                    valid = true;
                    break;
            }
        }
        
        return value;
    }
    
    private Date convertStringToDate(String dataRecebida) {
        
        Date dataNascimento = null;
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            dataNascimento = df.parse(dataRecebida);

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return dataNascimento;
    }
    /*    
    protected void setValue(String field, Object objeto){
        
        PropertyAccessor propAccessor = PropertyAccessorFactory.forBeanPropertyAccess(objeto);   
        Scanner sc = new Scanner(System.in);
        
        Object valorModificado = null;
        Object valorAtual;
        
        do {
            try {
                valorModificado = scanSpecific(field, sc, objeto.getClass());
            } catch (NoSuchFieldException ex) {
                ex.printStackTrace();
            }

            propAccessor.setPropertyValue(field, valorModificado);
            valorAtual = propAccessor.getPropertyValue(field);
            
            if(valorAtual == null)
                valorAtual = new Object();
            
        } while (! valorAtual.equals(valorModificado)) ;
    }
    */
    
}
