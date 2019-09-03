package entidades;


public class circonfe {
    
    public final static double PI = 3.14159;
    
    public static double circonferencia(double rad){
        
        return 2.0 * PI * rad;
        
    }
    
    public static double volume(double rad){
        
        return 4.0 * PI * rad * rad * rad / 3.0;
        
    }
    
    
}
