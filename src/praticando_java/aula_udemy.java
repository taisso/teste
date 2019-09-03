package praticando_java;

import java.util.Scanner;

public class aula_udemy {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float nota, recb = 0;
        for(int i = 1; i <= 3; i++){
            System.out.printf("Digite sua %d nota: ", i);
            nota = input.nextFloat();
            System.out.print("\n");
            recb += nota; 
        }
        recb /= 3;
        
        if(recb >= 7.0)System.out.printf("Aluno aprovado com media: %.2f\n", recb);
        else System.out.printf("Aluno reprovado com media: %.2f\n", recb);
      
        /*
        String nome = "Maria dos Santos";VARIÁVEL DO TIPO STRING
        Object obj1 = 4.5;VARIÁVEL DO TIPO OBJECT(GENÉRICO);
        */
    }

    
}
