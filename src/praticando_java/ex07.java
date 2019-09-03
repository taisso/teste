package praticando_java;


import java.util.Scanner;

public class ex07{
    
    
    public static void intervalo(int n, Scanner input){
        
        int cont = 0, cont2 = 0;
        
        for(int i = 1; i <= n; i++){
            int a = input.nextInt();
            
            if(10 >= a && a <= 20)cont++;
            else cont2++;
        }
               
       System.out.println("In: " + cont + '\n' + "Out: " + cont2 + '\n');
       input.close();
    }
    
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
       
        int n = input.nextInt();
        intervalo(n, input);
       
      
    }
       
    
}
