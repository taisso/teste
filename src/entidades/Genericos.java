package entidades;

import java.util.ArrayList;
import java.util.List;


public class Genericos<T>{
    
    private List<T> lista = new ArrayList<>();
    
    
    public void adiciona(T valor){
        lista.add(valor);
    }
    
    public T primeiro(){
        
        if(lista.isEmpty()){
            
            throw new IllegalStateException("Lista vazia!");
        }
        
        return lista.get(0);
    }
}
