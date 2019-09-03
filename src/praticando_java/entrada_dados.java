package praticando_java;

import java.util.Scanner;

public class entrada_dados {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String x, y, z;
        System.out.println("Digite algo: ");
        x = input.next();
        y = input.next();
        z = input.next();
        
        String s = input.next();
        char primeiro = s.charAt(0);
        int ult =  Integer.parseInt(s.substring(1));
        
        System.out.print(primeiro + "\n");
        System.out.print(ult);
        
        char a;
        
        System.out.print("\nDigite um caractere: ");
        a = input.next().charAt(0);//Pega o primeiro caractere
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        
   
        input.close();
    }
    
    
    
}
