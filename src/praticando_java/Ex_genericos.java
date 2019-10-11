package praticando_java;

import entidades.Generico;
import entidades.Product2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Ex_genericos {
    
    public static void main(String[] args) {
        
        String diretorio = "C:\\Users\\taiss\\OneDrive\\Área de Trabalho\\Arquivos da faculdade\\Programando\\praticando_java\\src\\praticando_java\\in.txt";
        List<Product2> list = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(diretorio))) {
            
            String nome = br.readLine();
            while(nome != null){
                
                String[] info = nome.split(",");
                list.add(new Product2(info[0], Double.parseDouble(info[1])));
                nome = br.readLine();
            }
            
            Product2 x = Generico.max(list);
            System.out.println("O maior é: ");
            System.out.println(x);
            
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
    }

}
