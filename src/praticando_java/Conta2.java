package praticando_java;

import java.util.InputMismatchException;
import model.entidades.Account;
import java.util.Locale;
import java.util.Scanner;


public class Conta2 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        
        try {
            
            System.out.println("Entre com a conta: ");
            
            System.out.print("Número: ");
            int numero = input.nextInt();
            
            input.nextLine();
            
            System.out.print("Nome: ");
            String nome = input.nextLine();
            
            System.out.print("Valor inicial: ");
            double saldo = input.nextDouble();
            
            System.out.print("Limite da conta: ");
            double limite = input.nextDouble();
            
            System.out.println();
            
            Account a = new Account(numero, nome, saldo, limite);
            
            System.out.print("Quanto vai saquar: ");
            a.saque(input.nextDouble());
            System.out.println("Novo saldo: " + String.format("%.2f", a.getSaldo()));
            
        } catch (IllegalArgumentException e) {
            
            System.out.println("Retirar o erro: " + e.getMessage());
            
        }catch(InputMismatchException e){
            
            System.out.println("Valor invalido!");
        }
        
    }
    
    
}
