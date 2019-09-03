package praticando_java;

import entidades.ListaEncadeada;


public class ImplementandoLista {
    
    
    public static void main(String[] args){
        
        ListaEncadeada p = new ListaEncadeada();
        
        p.InsereListaInicio(10);
        p.InsereListaInicio(15);
        p.InsereListaInicio(55);
        p.InsereListaInicio(9);
        p.InsereListaInicio(22);
        p.InsereListaInicio(99);
        p.ImprimeLista();
        System.out.println();
        p.LiberaLista();
        
    }
    
    
}
