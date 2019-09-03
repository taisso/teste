package praticando_java;

import entidades.Empregado;
import java.util.Locale;
import java.util.Scanner;

public class ex02_classe{
    
    
    public static void main(String[] args){
        
       Locale.setDefault(Locale.US);
       Empregado a = new Empregado();
       Scanner input = new Scanner(System.in);
       
       System.out.print("Nome: ");
       a.nome = input.nextLine();
       
       System.out.print("Salario Bruto: ");
       a.salarioBruto = input.nextDouble();
       
       System.out.print("Taxa: ");
       a.imposto = input.nextDouble();
       
       System.out.println("Empregrado: " + a.toString());
       
       System.out.print("Qual o incremento em porcentagem do salario: ");
       double porcentagem = input.nextDouble();
       
       a.IncrementarSalario(porcentagem);
       System.out.println("Dados atualizados: " + a.toString());
    }
    
    
}