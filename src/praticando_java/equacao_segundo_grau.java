package praticando_java;

import java.util.Scanner;

public class equacao_segundo_grau {
    
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Digite os valores de A, B e C: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
       
        double x1, x2;
        
        x1 = (double) -b + Math.sqrt(Math.pow(b,2) - 4*a*c);
        x2 = (double) -b - Math.sqrt(Math.pow(b,2) - 4*a*c);
        
        System.out.printf("X1: %.1f\nX2: %.1f\n", x1/(2*a), x2/(2*a));
        
        input.close();
    }
    
    
}
