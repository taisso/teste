package entidades;

import java.util.function.Function;

public class ProductFunction implements Function<Product2,String>{

	@Override
	public String apply(Product2 p) {
		return p.getNome().toUpperCase();
		
	}

}
