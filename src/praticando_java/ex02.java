package praticando_java;

import java.util.*;//IMPORTA TODAS AS CLASSES

public class ex02{
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
       
        System.out.println("Digite seu nome completo: ");
        String nome = input.nextLine();
        
        System.out.println("Quantos comodos voce tem na sua casa ");
        int qt = input.nextInt();
        
        System.out.println("Qual preco do seu produto: ");
        float preco = input.nextFloat();
        
        System.out.println("Digite seu ultimo nome, idade e altura: ");
        String ultimoNome = input.next();
        int idade = input.nextInt();
        float altura = input.nextFloat();
        
        
        System.out.println("\n"+nome);
        System.out.println(qt);
        System.out.printf("%.2f\n", preco);
        System.out.printf("%s %d %.2f\n", ultimoNome, idade, altura);
        
        
        input.close();
        
    }
    
    
    
}