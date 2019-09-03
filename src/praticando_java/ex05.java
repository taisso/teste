package praticando_java;

import java.util.Scanner;

public class ex05 {
    
    public static void exibi(int alcool, int gasolina, int diesil){
        
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesil: " + diesil);
    }
   
    public static void main(String[] args){
        
        int a, gasolina, alcool, diesil;
        
        Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        gasolina = alcool = diesil = 0;
        
        while(a != 4){
            a = input.nextInt();
            
            if(a == 1)alcool++;
            else if(a == 2)gasolina++;
            else if(a == 3) diesil++;
        }
        exibi(alcool,gasolina,diesil);
        input.close();
    }
    
}
