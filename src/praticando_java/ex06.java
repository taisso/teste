package praticando_java;

import java.util.Scanner;

public class ex06{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int a = 0;
        
        while(a != 2002){
            a = input.nextInt();
            System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
        input.close();
    }
}