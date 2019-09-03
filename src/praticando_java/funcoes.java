package praticando_java;

import java.util.Scanner;

public class funcoes{
    
    
    public static int maior(int a, int b, int c){
        
        if(a > b && a > c)return a;
        else if(b > c)return b;
        else return c;   
    }
    
    public static void exibir(int a){
        
        System.out.println("O maior valor é: " + a);
        
    }
   
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite três números: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int recb = maior(a,b,c);
        exibir(recb);
        
        input.close();
        
    }
    
}