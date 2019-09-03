package praticando_java;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class lista{
    
    public static void main(String[] args){
        
        List<String> list = new ArrayList<>();
        
        list.add("Alex");
        list.add("Ana");
        list.add("Maria");
        list.add("Carlos");
        list.add("Pedro");
        list.add("Marcos");
        list.add("Manoela");
        list.add("Taisso");
        list.add(2, "Felipe");//ADCIONA NA POSIÇÃO QUÊ DESEJAR
     
        System.out.println("Tamanho da lista: " + list.size());//SABER QUAL O TAMANHO DA LISTA
        list.remove("Maria");//REMOVE UM NÓ DA LISTA
        list.remove(3);//TAMBÉM PODE REMOVER INFORMANDO A POSIÇÃO "Pedro"
        
        for(String i : list){
            System.out.println(i);
        }
        System.out.println("---------------------------");
        
        list.removeIf(x -> x.charAt(0) == 'M');
        /*EXEMPLO: PEGA UM VALOR x E ME RETORNA SE
        x.CharAt(0) == 'M'(SE É IGUAL A 'M' - VERDADEIRO)
        
        OBS: PODE RETORNA VERDADEIRO OU FALSO
        */
        
         for(String i : list){
            System.out.println(i);
        }
        System.out.println("---------------------------");
        System.out.println("indexOf(Taisso): " + list.indexOf("Taisso"));
        System.out.println("---------------------------");
        
        List<String> resul = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        
        for(String i : resul){
            System.out.println(i);
        }
        System.out.println("---------------------------");
        
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
    
    }
    
    
}