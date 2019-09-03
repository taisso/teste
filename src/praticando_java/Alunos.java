package praticando_java;

import entidades.Quartos;
import java.util.Scanner;


public class Alunos {
    
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        Quartos[] vetor = new Quartos[10];
        
        for(int i = 0; i < n; i++){
            input.nextLine();
   

            System.out.println("Aluno: " + (i+1));
            System.out.print("Nome: ");
            String nome = input.nextLine();
            
            System.out.print("E-mail: ");
            String Email = input.nextLine();

            System.out.print("Quarto: ");
            int quarto = input.nextInt();

                
            if(vetor[quarto] == null){
                vetor[quarto] = new Quartos(nome,Email,quarto); 
            }
            else System.out.println("Já tem um aluno que reside no quarto: " + quarto);
            System.out.println();
        }
        
        
        System.out.println("Os residentes dos quartos são: ");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] != null){
               System.out.print((i+1) + ": "); 
               System.out.println(vetor[i].toString());
            }
        }

        input.close();
                
    }
    
    
}
