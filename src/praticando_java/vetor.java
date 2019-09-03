package praticando_java;

import java.util.Locale;
import java.util.Scanner;

public class vetor{
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        double[] vetor = new double[n];
        
        double soma = 0.0;
        
        for(int i = 0; i < n; i++){
            vetor[i] = input.nextDouble();
            soma += vetor[i];
        }
        System.out.printf("A media: %.2f\n", soma/n);
        
        
        input.close();
        
    }
    
    
}