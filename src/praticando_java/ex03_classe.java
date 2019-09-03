package praticando_java;

import entidades.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class ex03_classe {
   
   public static void main(String[] args){
       
       Aluno a = new Aluno();
       Locale.setDefault(Locale.US);
       Scanner input = new Scanner(System.in);
       
       a.nome = input.nextLine();
       a.nota1 = input.nextDouble();
       a.nota2 = input.nextDouble();
       a.nota3 = input.nextDouble();
       
       System.out.println("FINAL GRADE: " + a.somaNotas());
       
       if(a.somaNotas() > 60.0){
           System.out.println("PASS");
       }
       else{
           System.out.println("FAILED");
           System.out.println("MISSING " + String.format("%.2f", a.avaliarAluno()) + " POINTS");
       }
       
   }
    
    
    
}
