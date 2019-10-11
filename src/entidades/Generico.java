package entidades;

import java.util.List;


public class Generico{
    
    
    public static <T extends Comparable<? super T>> T max(List<T> list){
        
        T p = list.get(0);
        for(T item : list){
            if(item.compareTo(p) > 0)p = item;
        }
        return p;
    }   
}
