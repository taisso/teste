package praticando_java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ex_lista {
    
    
    public static void main(String[] args){
        
        List<String> lista = new ArrayList<>();
       
        lista.add("Larissa");
        lista.add("Bruno");
        lista.add("Matheus");
        lista.add("Daniel");
        lista.add("Diego");
        lista.add("Carlos");
        lista.add("Ana");
        lista.add("Juliana");
        lista.add(2, "Taisso");
        
        lista.remove("Bruno");
        lista.remove(0);
        lista.removeIf(x -> x.charAt(0) == 'A');
        
        System.out.println("Tamanho da lista: " + lista.size() + '\n');
        for(String i : lista){
            System.out.println(i);
        }
        System.out.println("------------------------------\n");
        System.out.println(lista.indexOf("Diego"));
        System.out.println("------------------------------\n");
        
        List<String> resul = lista.stream().filter(x -> x.charAt(0) == 'D').collect(Collectors.toList());
        
        for(String i : resul){
            System.out.println(i);
        }
        System.out.println("------------------------------\n");
         
        String nome = lista.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
        System.out.println(nome);
        
       
    }
    
}
