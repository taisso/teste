package praticando_java;

import java.util.Scanner;
import ContaBancario.ContaCliente;
import java.util.Locale;

public class conta{
    
    
    public static void main(String[] args){
       
       Locale.setDefault(Locale.US);
       Scanner input = new Scanner(System.in);
       ContaCliente a;
       
       System.out.print("Numero da conta: ");
       int nConta = input.nextInt();
        
       input.nextLine();//PEGAR O ESPAÇO
       System.out.print("Nome: ");
       String nome = input.nextLine();
        
       System.out.print("Desejar depositar depositar dinheiro para iniciar(s/n): ");
        
       if(input.next().charAt(0) == 's'){
          System.out.print("Valor incial do deposito: ");
          double valor = input.nextDouble();
          a = new ContaCliente(nConta, nome,valor);
       }
       else a = new ContaCliente(nConta, nome); 
        
       System.out.println("\nDados da Conta:");
       System.out.println(a.toString());
          
       System.out.print("Valor de deposito:");
       double valor = input.nextDouble();
       System.out.println(a.toString());
       
       a.saldoConta(valor);
       System.out.println("\nDados atualizados:");
       System.out.println(a.toString());
       
       System.out.print("Valor de saque: ");
       valor = input.nextDouble();
       
       a.saqueConta(valor);
       System.out.println("\nDados atualizados:");
       System.out.println(a.toString());
       input.close();
         
    }
    
  
}