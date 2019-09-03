package praticando_java;

import entidades.retangulo;
import java.util.Locale;
import java.util.Scanner;

public class ex01_classe {
    
    
    public static void main(String[] args){
        
        retangulo a = new retangulo();
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a largura e altura do retangulo: ");
        a.altura = input.nextDouble();
        a.largura = input.nextDouble();
        
        System.out.printf("AREA = %.2f\n", a.area());
        System.out.printf("PERIMETRO = %.2f\n", a.perimetro());
        System.out.printf("DIAGONAL = %.2f\n", a.diagonal());
        
    }
    
    
}
