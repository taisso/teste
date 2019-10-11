package praticando_java;

import entidades.Genericos;


public class Tipos_Genericos {
    
    public static void main(String[] args) {
        
        Genericos<Integer> a = new Genericos<>();
        
        a.adiciona(10);
        a.adiciona(20);
        Integer b = a.primeiro();
        System.out.println(b);
        
        
    }

}
