package praticando_java;

import java.util.Scanner;

public class ex03 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite três numeros: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        
        if(a > b && a > c)System.out.println("O maior valor é: " + a);
        else if(b > c)System.out.println("O maior valor é: " + b);
        else System.out.println("O maior valor é: " + c);
        
    }
    
}
