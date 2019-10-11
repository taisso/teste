package entidades;

import java.util.Comparator;


public class MeuComparador implements Comparator<Product2>{

    @Override
    public int compare(Product2 o1, Product2 o2) {
       return o1.getNome().toUpperCase().compareTo(o2.getNome().toUpperCase());
    }

}
