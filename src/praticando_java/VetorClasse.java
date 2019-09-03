package praticando_java;

import java.util.Scanner;
import entidades.produtos;
import java.util.Locale;

public class VetorClasse {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        produtos[] vetor = new produtos[n];
        double soma = 0.0;
        
        for(int i = 0; i < vetor.length; i++){
            input.nextLine();
            
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Preco: ");
            double preco = input.nextDouble();
            
            vetor[i] = new produtos(nome,preco);
            System.out.println();
           
        }
        
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i].getPreco();
        }
        
        System.out.printf("A media e: %.2f\n", soma/vetor.length);
        input.close();
    }
    
    
}
