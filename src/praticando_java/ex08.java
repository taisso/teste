package praticando_java;

import entidades.produto;
import java.util.Scanner;
import java.util.Locale;

public class ex08 {
    
    public static void main(String[] args){
       
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
       
        System.out.println("Entre com os dados do produto: ");
        
        System.out.print("Nome: ");
        String nome = input.next();
        System.out.print("Preço: ");
        double preco = input.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();
        
        produto a = new produto(nome, preco, quantidade);
       
        a.setNome("Computador");
        System.out.println("O nome do produto: " + a.getNome());
        
        System.out.println("Dados do produto: " + a);
        //System.out.printf("Dados do produto: %s, $ %.2f, %d unidades, Total: $ %.2f\n", 
        //a.nome, a.preco, a.quantidade, a.valorTotalEstoque());
        
        System.out.print("\nEntre com os dados do produto para ser inseridos no estoque: ");
        int b = input.nextInt();
        a.AdcionaProduto(b);
        
        System.out.println("Dados do produto atualizado: " + a);
        //System.out.printf("Dados do produto atualizados: %s, $ %.2f, %d unidades, Total: $ %.2f\n", 
        //a.nome, a.preco, a.quantidade, a.valorTotalEstoque());
        
        
        System.out.print("\nEntre com os dados do produto para ser removidos do estoque: ");
        b = input.nextInt();
        a.RemoveQuantidade(b);
        
        System.out.println("Dados do produto atualizado: " + a);
        //System.out.printf("Dados do produto atualizados: %s, $ %.2f, %d unidades, Total: $ %.2f\n", 
        //a.nome, a.preco, a.quantidade, a.valorTotalEstoque());
        
        input.close();
    }
    
    
}
