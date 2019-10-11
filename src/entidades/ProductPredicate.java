package entidades;

import java.util.function.Predicate;


public class ProductPredicate implements Predicate<Product2>{

    @Override
    public boolean test(Product2 t) {
        return t.getPreco() >= 200.00;
    }
    
    

}
