package praticando_java;


import java.util.*;

public class ex04 {
    
    public static void main(String[] args){
        
        int codigo, quantidade;
        float resul;
        
        Scanner input = new Scanner(System.in);
        
        
        codigo = input.nextInt();
        quantidade = input.nextInt();
        
        if(codigo == 1)resul = ((float) (quantidade * 4.00));
        else if(codigo == 2)resul = ((float) (quantidade * 4.50));
        else if(codigo == 3)resul = ((float) (quantidade * 5.00));
        else if(codigo == 4)resul = ((float) (quantidade * 2.00));
        else resul = ((float) (quantidade * 1.50));
        
        Locale.setDefault(Locale.US);
        System.out.printf("TOTAL: %.2f\n", resul);
        
        input.close();
        
    }
    
    
    
    
    
}
