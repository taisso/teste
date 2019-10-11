package entidades;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

public class TestandoCoringa {
    
    public static void main(String[] args) throws URISyntaxException, IOException {
        
        TestandoGenerico a = new TestandoGenerico("Taisso", 800.00);
        TestandoGenerico b = new TestandoGenerico("Ana", 700.00);
        
        List<Product2> list = Arrays.asList(a, b);
        
        System.out.println(Generico.max(list));
        
        //URI link = new URI("www.google.com");
        //Desktop.getDesktop().browse(link);
        
    }
    
}
