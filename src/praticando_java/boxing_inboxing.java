package praticando_java;

public class boxing_inboxing {
    
    public static void main(String[] args){
        
        int x = 20;
        Object obj = x;
        x = 30;
        System.out.println(obj);
        
        int y = (int)obj * 2;
        
        System.out.println(y);
        
        /*
        Double, Integer, Character,
        Float, Long, Boolean...
        
        
        */
        
    }
    
    
}
