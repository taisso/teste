package praticando_java;

import entidades.AluguelCarro;
import entidades.Fatura;
import entidades.Veiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.servicos.AluguelServico;
import model.servicos.BrasilTaxaServico;


public class Program7 {
    
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
	System.out.println("Enter rental data");
	System.out.print("Car model: ");
	String carModel = sc.nextLine();
	System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
	Date start = sdf.parse(sc.nextLine());
	System.out.print("Return (dd/MM/yyyy HH:mm): ");
	Date finish = sdf.parse(sc.nextLine());
		
	AluguelCarro cr = new AluguelCarro(start, finish, new Veiculo(carModel));

	System.out.print("Enter price per hour: ");
	double pricePerHour = sc.nextDouble();
	System.out.print("Enter price per day: ");
	double pricePerDay = sc.nextDouble();
		
	AluguelServico rentalService = new AluguelServico(pricePerDay, pricePerHour, new BrasilTaxaServico());
		
	rentalService.processoFatura(cr);

	System.out.println("INVOICE:");
	System.out.println("Basic payment: " + String.format("%.2f", cr.getFatura().getPagamentoBasico()));
	System.out.println("Tax: " + String.format("%.2f", cr.getFatura().getTaxa()));
	System.out.println("Total payment: " + String.format("%.2f", cr.getFatura().PagamentoTotal()));
		
	sc.close();
        
        
    }
    
    
}
