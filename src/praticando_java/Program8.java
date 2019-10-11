package praticando_java;

import entidades.Contrato;
import entidades.Prestacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.servicos.ContratoPorServico;
import model.servicos.PagamentoPorServico;


public class Program8 {
    
    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o contrato: ");
        
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Data(DD/MM/YYYY): ");
        Date data = sdf.parse(sc.nextLine());
        
        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();
        
        Contrato contrat = new Contrato(numero, data, valor);
        
        System.out.print("Numeros de incremeto: ");
        int n = sc.nextInt();
        
   
        ContratoPorServico cs = new ContratoPorServico(new PagamentoPorServico());
        cs.ProcessoContrato(contrat, n);
        
        for(Prestacao c : contrat.getLista()){
            System.out.println(c.toString());
            
        }
    }

}
