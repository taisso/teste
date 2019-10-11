package praticando_java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.DadosCliente;

public class Ex02Stream {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String destino = "C:\\Users\\taiss\\OneDrive\\Área de Trabalho\\Arquivos da faculdade\\Programando\\praticando_java\\src\\praticando_java\\in.txt";
		List<DadosCliente> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(destino))) {

			String info = br.readLine();
			while (info != null) {
				String[] file = info.split(",");
				list.add(new DadosCliente(file[0], file[1], Double.parseDouble(file[2])));

				info = br.readLine();
			}
			System.out.print("Entre com o salario: ");
			double salario = sc.nextDouble();
			
			System.out.println("Email das pessoas cujo o salário ultrapasse " + String.format("%.2f", salario));

			List<String> email = list.stream()
								 .filter(p -> p.getSalario() > salario)
								 .map(p -> p.getEmail())
								 .sorted((p1,p2) -> p1.toUpperCase().compareTo(p2.toUpperCase()))
								 .collect(Collectors.toList());
			
			email.forEach(System.out::println);
			
			double soma = list.stream()
						  .filter(p -> p.getNomeString().charAt(0) == 'M')
						  .map(p -> p.getSalario())
						  .reduce(0.0, (x,y) -> x + y);
			
			System.out.println("A soma dos salarios que começam com a letra 'M' é: " + String.format("%.2f", soma));
			
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
