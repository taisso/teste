package entidades;

import java.util.function.Consumer;


public class ProductConsumer implements Consumer<Product2>{

    @Override
    public void accept(Product2 t) {
        t.setPreco(t.getPreco() * 1.1);
    }

}
