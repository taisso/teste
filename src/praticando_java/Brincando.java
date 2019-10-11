package praticando_java;

import entidades.Classe1;
import java.util.ArrayList;
import java.util.List;
import model.servicos.NewInterface;


public class Brincando {
    
    public static void main(String[] args) {
        
        List<Classe1> lista = new ArrayList<>();
        
        String[] nomes = {"Taisso", "Bruno", "Matheus", "Daniel"};
        int[] idades = {20, 21, 20, 19};
        double[] salarios = {400.00, 370.50, 600.00, 470.85};
        
        for(int i = 0; i < 4; i++){
            lista.add(new Classe1(nomes[i], idades[i], salarios[i]));
        }
        double recb = calcula_salario(lista);
        System.out.printf("%.2f\n", recb);
        
        List<?> lista2 = transfere(lista);
        
        
    }
    
    public static double calcula_salario(List<? extends NewInterface> list){
        
        double soma = 0.0;
        for(NewInterface p : list){
            soma += p.salario(2);
        }
        return soma;
    }
    
    public static List<?> transfere(List<? extends NewInterface> list){
        
        List<? super NewInterface> lista = new ArrayList<>();
        for(NewInterface p : list){
            lista.add(p);
        }
        return lista;
    }
    
   

}
