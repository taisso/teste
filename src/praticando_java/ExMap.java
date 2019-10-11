package praticando_java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;


public class ExMap {
    
    public static void main(String[] args) {
        
        String diretorio = "C:\\Users\\taiss\\OneDrive\\Área de Trabalho\\Arquivos da faculdade\\Programando\\praticando_java\\src\\praticando_java\\entrada.txt";
        Map<String,Integer> map = new HashMap<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(diretorio))){
            
            
            String nome = br.readLine();
            while(nome != null){
                
                String[] text = nome.split(",");
                String chave = text[0];
                
                
                if(map.containsKey(chave)){
                    
                    int soma = Integer.parseInt(text[1]);
                    int antigo = map.get(text[0]);
                    map.put(text[0], soma + antigo);
                }
                else{
                    
                    map.put(text[0], Integer.parseInt(text[1]));
                }
                
                nome = br.readLine();
            }
            for(String chave2 : map.keySet()){
               
                System.out.println(chave2 + ": " + map.get(chave2));
                
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
