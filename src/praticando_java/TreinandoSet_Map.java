package praticando_java;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class TreinandoSet_Map {
    
    public static void main(String[] args) {
        
        //Set<String> set = new HashSet<>();//TABELA HASH
        Set<String> set = new TreeSet<>(Arrays.asList("Taisso","Paulo", "Carlos", "Andressa"));//Ã�VORE RUBRO NEGRO
        //Set<String> set = new LinkedHashSet<>();
          
        //set.remove("Carlos");
        //set.removeIf(x -> x.length() > 5);
        boolean t = set.contains("Paulo");
        System.out.println(t);
        
        for(String p : set){
            System.out.println(p);
        }
        
        System.out.println("------------------------------------");
        
        Map<String,String> m = new TreeMap<>();
        
        m.put("Nome","Taísso");
        m.put("Email", "taissoreni@gmail.com");
        m.put("Telefone", "(84)99629-5947");
        
        m.remove("Email");
        m.put("Telefone", "(84)99929-9864");
        
        System.out.println("A chave 'Telefone' contem no Map " + m.containsKey("Telefone"));
        System.out.println("Número de telefone: " + m.get("Telefone"));
        System.out.println("Email: " + m.get("Email"));
        
        
        System.out.println();
        for(String chave : m.keySet()){
            System.out.println(chave + ": " + m.get(chave));
            
        }
    }
    

}
