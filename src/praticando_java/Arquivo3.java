package praticando_java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Arquivo3 {
    
    public static void main(String[] args) {
        
        String[] texto = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
        
        String destino = "C:\\Users\\taiss\\OneDrive\\Área de Trabalho\\Arquivos da faculdade\\Programando\\praticando_java\\src\\praticando_java\\out.txt";
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(destino,true))){
            
            for(String ler : texto){
                bw.write(ler);
                bw.newLine();
            }
            
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
