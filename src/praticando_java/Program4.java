package praticando_java;

import entidades.Produto2;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program4 {
    
    public static void main(String[] args) throws ParseException{
        
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner input = new Scanner(System.in);
        
        List<Produto2> list = new ArrayList<>();
        
        System.out.print("Entre com a quantidade de produtos: ");
        int n = input.nextInt();
        
        for(int i = 1; i <= n; i++){
            input.nextLine();
            System.out.println("Produto #" + i + " data");
            System.out.print("Comun, usado ou importado (c/u/i)? ");
            char opcao = input.next().charAt(0);
            input.nextLine();
            
            System.out.print("Nome: ");
            String nome = input.nextLine();
            
            System.out.print("Preço: ");
            double preco = input.nextDouble();
            
           
            if(opcao == 'u'){
                
                input.nextLine();
                System.out.print("Data de fabricação(DD/MM/YYYY): ");
                Date data =  sdf.parse(input.nextLine());
                
                list.add(new ProdutoUsado(nome, preco, data));
            }
            else if(opcao == 'i'){
                
                System.out.print("Custo do frete: ");
                double frete = input.nextDouble();
                
                list.add(new ProdutoImportado(nome, preco, frete));
            }
            else{
                
                list.add(new Produto2(nome, preco));
            }
        }
        System.out.println();
        
        System.out.println("Produtos: ");
        for(Produto2 c: list){
            System.out.println(c.precoTag());
        }
        
    }
    
    
}
