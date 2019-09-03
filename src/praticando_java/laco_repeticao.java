package praticando_java;

import java.util.*;

public class laco_repeticao{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int a = 1;
        
        while(a >= 0){
            System.out.print("Digite um numero: ");
            a = input.nextInt();
            
            if(a <= -1)break;
            double resul = Math.sqrt(a);
            Locale.setDefault(Locale.US);
            System.out.printf("%.3f\n", resul);
          
        }
        System.out.println("Número negativo!");
        input.close();
    }
        
}