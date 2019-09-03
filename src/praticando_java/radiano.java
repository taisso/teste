package praticando_java;

import java.util.Locale;
import java.util.Scanner;
import entidades.circonfe;


public class radiano {
    
    
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite os radianos: ");
        double rad = input.nextDouble();
        
        double a = circonfe.circonferencia(rad);
        double b = circonfe.volume(rad);
        
        System.out.printf("Circonferência: %.2f\n", a);
        System.out.printf("Volume: %.2f\n", b);
        System.out.printf("Valor do PI: %.2f\n", circonfe.PI);
        
        input.close();
    }
  
   
}
