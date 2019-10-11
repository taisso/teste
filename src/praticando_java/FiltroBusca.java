package praticando_java;

import java.util.List;
import java.util.function.Predicate;

import entidades.Product2;

public class FiltroBusca {
	
	
	public static double filtra(List<Product2> list, Predicate<Product2> criterio) {
		
		double value = 0;
		for(Product2 p : list) {
			if(criterio.test(p)) {
				value += p.getPreco(); 
			}
		}
		return value;
	}

}
