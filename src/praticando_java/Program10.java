package praticando_java;

import entidades.EntradaLog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Program10 {
    
    public static void main(String[] args) {
        
        String diretorio  = "C:\\Users\\taiss\\OneDrive\\Área de Trabalho\\Arquivos da faculdade\\Programando\\praticando_java\\src\\praticando_java\\in.txt";
        Set<EntradaLog> set = new HashSet<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(diretorio))){
            
            String info = br.readLine();
            while(info != null){
                
                String[] text = info.split(" ");
                set.add(new EntradaLog(text[0], Date.from(Instant.parse(text[1]))));
                info = br.readLine();
            }
            System.out.println("A quantidade de Logs: " + set.size());
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        
    }

}
