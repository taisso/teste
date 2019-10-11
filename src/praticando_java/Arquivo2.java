package praticando_java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo2 {
    
    public static void main(String[] args) {
        
        String texto = "C:\\Users\\taiss\\OneDrive\\Área de Trabalho\\Arquivos da faculdade\\Programando\\praticando_java\\in.txt";
        
        try(BufferedReader br = new BufferedReader(new FileReader(texto))){
            
           
            String nome = br.readLine();
            while(nome != null){
                System.out.println(nome);
                nome = br.readLine();
                
            }
            
        }
        catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
       
    }
    
}
