package praticando_java;

import entidades.ContratoPorHora;
import entidades.Departamento;
import entidades.Nivel;
import entidades.NivelFuncionario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    
    public static void main(String[] args) throws ParseException{
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o nome do departamento: ");
        Departamento depart = new Departamento(input.nextLine());
        
        System.out.print("Digite os dados do trabalhador: ");
        String nome = input.nextLine();
        
        System.out.print("Nível: ");
        NivelFuncionario nivel = NivelFuncionario.valueOf(input.next());
        
        System.out.print("Salario base: ");
        double salariobase = input.nextDouble();
        
        Nivel funcionario = new Nivel(nome, nivel, salariobase, depart);
        
        System.out.print("Quantos contratos para esse trabalhador ?");
        int n = input.nextInt();
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        for(int i = 1; i <= n; i++){
            input.nextLine();
            System.out.printf("Digite os dados do contrato nº %d: ", i);
            System.out.print("\nDate (DD/MM/YYYY): ");
            Date data = sdf1.parse(input.nextLine());
            
            System.out.print("Valor por hora: ");
            double hora = input.nextDouble();
            
            System.out.print("Duração(Horas): ");
            int duracao = input.nextInt();
            funcionario.adicionaContrato(new ContratoPorHora(data,hora,duracao));
        }
        
        System.out.print("\nDigite o mês e o ano par calcular a renda: ");
        nome = input.next();
        int mes = Integer.parseInt(nome.substring(0,2));//PEGA O MES
        int ano = Integer.parseInt(nome.substring(3));//PEGA O ANO
        
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
        System.out.println("Renda " + nome + ": " + String.format("%.2f", funcionario.renda(ano, mes)));
    }
    
    
}
