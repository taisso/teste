package praticando_java;

import entidades.Teste_soma;
import model.servicos.Soma;


public class Teste {
    
    public static void main(String[] args) {
        
        Soma a = new Teste_soma();
        Teste_soma b = new Teste_soma();
        
        
        System.out.println(a.soma_valores(10, 5));
        System.out.println(b.soma_valores(5, 5));
        
    }

}
