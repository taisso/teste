package praticando_java;

import java.util.Scanner;
import java.util.Locale;
import entidades.triangulo;

public class sem_oriatacao_objeto {
    
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        triangulo x, y;
        
        x = new triangulo();
        y = new triangulo();
        
        System.out.println("Digite as coordenadas do eixo X: ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();
        
        System.out.println("Digite as coordenadas do eixo Y: ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();
        
        double areaX = x.area();
        double areaY = y.area();
        
        System.out.printf("Area do triângulo X: %.4f\n", areaX);
        System.out.printf("Area do triângulo Y: %.4f\n", areaY);
        
        if(areaX > areaY)System.out.println("Área X é a maior!");
        else System.out.println("Área Y é a maior!");
       
        input.close();
        
    }
 
    
}
