package praticando_java;

import entidades.SalarioFuncionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Funcionario {
    
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<SalarioFuncionario> lista = new ArrayList<>();
        
        System.out.print("Quantos funcionarios vão se cadastar ?: ");
        int n = input.nextInt();
        
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.println("Funcionário #" + (i+1) + ':');
            
            System.out.print("Id: ");
            int id = input.nextInt();
            
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            nome = nome.substring(0,1).toUpperCase() + nome.substring(1);//DEIXAR O PRIMEIRO CARACTERE MAIÚSCULO
            
            System.out.print("Salário: ");
            double salario = input.nextDouble();
           
           lista.add(new SalarioFuncionario(nome,id,salario));
           System.out.println();
        }
        System.out.print("Digite a identificação do funcionário que terá aumento salário: ");
        int busca = input.nextInt();
        
       SalarioFuncionario resul = lista.stream().filter(x -> x.getId() == busca).findFirst().orElse(null);
        
       if(resul == null){
           System.out.println("Funcionario nao existe!");
       }
       else{
           System.out.print("Informe a porcentegem para acrescentar ao salário: ");
           resul.IncrementoSalario(input.nextDouble());
       }
       
       System.out.println("\nLista de fucionários: ");
       for(SalarioFuncionario i : lista){
           System.out.println(i.toString());
       } 
       
    }
    
    
}
