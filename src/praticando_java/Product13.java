package praticando_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import entidades.Product2;

public class Product13 {

	public static void main(String[] args) {
        
    	Locale.setDefault(Locale.US);
        List<Product2> list = new ArrayList<>();
        
        list.add(new Product2("Taísso", 200.00));
        list.add(new Product2("Luana", 370.00));
        list.add(new Product2("Bianca", 192.00));
        
        list.sort((p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));//Comparator
        //Predicate<Product2> pred = p -> p.getPreco() >= 200.00;
        
        //list.removeIf(Product2 :: staticProduct2Predicate);
        //list.removeIf(Product2 :: nonStaticProduct2Predicate);
        //list.removeIf(Product2 :: nonStaticProduct2Predicate);
        
        Function<Product2, String> function = p -> p.getNome().toUpperCase();
        
        list.forEach(p -> p.setPreco(p.getPreco() * 1.1));//Consumer
        List<String> lista2 = list.stream().map(function).collect(Collectors.toList());//Function
        
        
        lista2.forEach(System.out :: println);
        
        
        /*
         O metódo do Predicate retorna boolean
         O metódo do Consumer é do tipo void
         O metódo do Function retorna a converte um tipo para outro.
        */
        
        System.out.println("-----------------------------");
        List<Product2> list3 = new ArrayList<>();
        
        list3.add(new Product2("Taísso", 200.00));
        list3.add(new Product2("Luana", 370.00));
        list3.add(new Product2("Bianca", 192.00));
        list3.add(new Product2("Teodoro", 195.00));
        
        System.out.println(FiltroBusca.filtra(list3, p -> p.getNome().charAt(0) == 'T'));
        
        
        
    }

}
