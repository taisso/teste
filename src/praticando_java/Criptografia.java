package praticando_java;

import java.util.Scanner;


public class Criptografia {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = input.nextLine();
        
        char[] c = nome.toCharArray();
        
        char[] v = new char[c.length];
        int j = 0;
        for(int i = c.length - 1; i >= 0; i--){
            v[j] = c[i];
            j++;
        }
        for(char d : v){
            System.out.print(d);
        }
        nome = String.valueOf(v);
        System.out.println();
        System.out.println(nome);
                
    }
    
}
