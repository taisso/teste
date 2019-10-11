package praticando_java;

import entidades.Funcionario;
import entidades.FuncionarioTerceirizado;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program3 {
    
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();
        
        System.out.print("Entre com a quantidade funcionários: ");
        int n = input.nextInt();
        
        for(int i = 1; i <= n; i++){
            input.nextLine();
            System.out.println("Funcionário #" + i + " data");
            System.out.print("Terceirizado(s/n): ");
            char opcao = input.next().charAt(0);
            input.nextLine();
            
            System.out.print("Nome: ");
            String nome = input.nextLine();
            
            System.out.print("Horas: ");
            int horas = input.nextInt();
            
            System.out.print("Valor por horas: ");
            double vHoras = input.nextDouble();
            
            if(opcao == 's' ||opcao == 'S'){
                System.out.print("Taxa adicional: ");
                double taxa = input.nextDouble();
                list.add(new FuncionarioTerceirizado(nome,horas,vHoras,taxa));
            }
            else{
                list.add(new Funcionario(nome,horas,vHoras));  
            }
        }
        
        System.out.println();
        System.out.println("Pagamentos:");
        for(Funcionario c : list){
            System.out.println(c.getNome() + " - $ " + String.format("%.2f", c.FormaPagamento()));
            
        }
        input.close();
    }
    
}
