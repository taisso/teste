package praticando_java;

import entidades.PessoaFisica;
import entidades.PessoaJuridica;
import entidades.TaxPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program5 {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<TaxPlayer> lista = new ArrayList<>();
        
        System.out.print("Entre com a quantidade de funcionários: ");
        int n = input.nextInt();
        
        for(int i = 1; i <= n; i++){
            input.nextLine();
            
            System.out.println("Taxa do funcionário #" + i + " data");
            System.out.print("Pessoa física ou jurídica (f/j)? ");
            char opcao = input.next().charAt(0);
            
            input.nextLine();
            
            System.out.print("Nome: ");
            String nome = input.nextLine();
            
            System.out.print("Renda anual: ");
            double renda = input.nextDouble();
            
            if(opcao == 'f'){
                System.out.print("Custo de saúde: ");
                double saude = input.nextDouble();
                
                lista.add(new PessoaFisica(nome, renda, saude));
            }
            else{
                
                System.out.print("Quantos funcionários: ");
                int quant = input.nextInt();
                
                lista.add(new PessoaJuridica(nome, renda, quant));
                
            }
            
        }
        System.out.println();
        
        double soma = 0.0;
        System.out.println("Taxas pagas:");
        for(TaxPlayer c : lista){
            soma += c.taxa();
            System.out.println(c.getNome() + ": $ " + String.format("%.2f",c.taxa()));
        }
        System.out.println("Taxa total: $ " + String.format("%.2f", soma));
        
        input.close();
    }
    
}
