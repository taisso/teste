package praticando_java;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Arquivo {
    
    public static void main(String[] args){
        
        File arq = new File("C:\\Users\\taiss\\OneDrive\\Área de Trabalho\\Arquivos da faculdade\\Programando\\praticando_java\\in.txt");
        Scanner sc = null;
        
        try{
            sc = new Scanner(arq);
          
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            
        }
        catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally{
            if(sc != null){
                sc.close();
            }
        
        }
        
    }
    
}
