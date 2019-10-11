package praticando_java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.sun.java_cup.internal.runtime.Scanner;

import entidades.Product2;
import sun.net.www.content.text.plain;

public class ExStream {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String destino = "C:\\Users\\taiss\\OneDrive\\Área de Trabalho\\Arquivos da faculdade\\Programando\\praticando_java\\src\\praticando_java\\in.txt";
		List<Product2> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(destino))){
			

			String info = br.readLine();
			while (info != null) {
				String[] file = info.split(",");
				list.add(new Product2(file[0], Double.parseDouble(file[1])));
				
				info = br.readLine();
			}
			double soma = list.stream()
						  .map(p -> p.getPreco())
						  .reduce(0.0, (x,y) -> x + y) / list.size();
			
			System.out.println("A média é: " + String.format("%.2f", soma));
			
			Comparator<String> comparator = (p1, p2) -> p1.toUpperCase().compareTo(p2.toUpperCase());
			
			
			List<String> nome = list.stream()
								.filter(p -> p.getPreco() < soma)
								.map(p -> p.getNome())
								.sorted(comparator.reversed())
								.collect(Collectors.toList());
								
			nome.forEach(System.out :: println);
			
		} catch (IOException e) {
				e.printStackTrace();;
			
		}
		
		
	}

}
