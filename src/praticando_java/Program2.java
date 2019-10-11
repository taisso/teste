package praticando_java;

import entidades.Cliente;
import entidades.Order;
import entidades.OrderIten;
import entidades.OrderStatus;
import entidades.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Program2 {
    
    public static void main(String[] args) throws ParseException{
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Entre com o cliente: ");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        
        System.out.print("Email: ");
        String email = input.nextLine();
        
        System.out.print("Date de nascimento (DD/MM/YYYY): ");
        Date data = sdf.parse(input.nextLine());
        
        Cliente cliente = new Cliente(nome,email,data);
        
        System.out.println("Insira os dados do pedido: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(input.nextLine());
        
        Order ordem = new Order(new Date(), status, cliente);
        
        System.out.print("Quantos itens para este pedido? ");
        int n = input.nextInt();
        
        for(int i = 1; i <= n; i++){
            input.nextLine();
            
            System.out.println("Digite os dados do item nº " + i + ':');
            System.out.print("Nome do produto: ");
            nome = input.nextLine();
            
            System.out.print("Preço do produto: ");
            double preco = input.nextDouble();
            
            Product produto = new Product(nome, preco);
            
            System.out.print("Quantidade: ");
            int quant = input.nextInt();
            
            OrderIten OrdemItem = new OrderIten(quant, preco, produto);
            ordem.addIntem(OrdemItem);
        }
        System.out.println();
        System.out.println(ordem);
        
    }
    
}
