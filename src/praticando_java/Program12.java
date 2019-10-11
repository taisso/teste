package praticando_java;

import entidades.Product2;
import java.util.ArrayList;
import java.util.List;


public class Program12 {
    
    public static void main(String[] args) {
        
        List<Product2> list = new ArrayList<>();
        
        list.add(new Product2("Taísso", 990.00));
        list.add(new Product2("Luana", 1100.00));
        list.add(new Product2("Ana", 888.00));
        
                 
        list.sort((p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
        
        list.forEach(System.out :: println);
        
    }

}
