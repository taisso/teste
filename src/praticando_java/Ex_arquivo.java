package praticando_java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Ex_arquivo {
    
    public static void main(String[] args) {
        
        String origem = "C:\\Users\\taiss\\OneDrive\\Área de Trabalho\\Arquivos da faculdade\\Programando\\praticando_java\\in.txt";
        String destino = "C:\\Users\\taiss\\OneDrive\\Área de Trabalho\\Arquivos da faculdade\\Programando\\praticando_java\\Out";
        boolean a = new File(destino).mkdir();
        
        Locale.setDefault(Locale.US);
        Scanner sc = null;
        File arq = new File(origem);
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(destino + "\\sumario.csv"))){
            
            String info;
            
            sc = new Scanner(arq);
            while(sc.hasNextLine()){
                    
                info = sc.nextLine(); 
                String[] resul = info.split(",");
                
                String nome = resul[0];
                double valor = Double.parseDouble(resul[1]);
                int quant = Integer.parseInt(resul[2]);
                
                bw.write(nome + "," + String.format("%.2f", valor * quant));
                bw.newLine();
            }
          
            
        }
        catch(IOException e){
            e.printStackTrace();
            
        }
        
    }
    
}
