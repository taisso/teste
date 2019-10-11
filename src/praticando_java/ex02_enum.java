package praticando_java;

import entidades.Comentario;
import entidades.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ex02_enum {
    
    public static void main(String[] args) throws ParseException{
        
        Comentario c1 = new Comentario("Have a nice trip!");
        Comentario c2 = new Comentario("Wow that's awesome!");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Post p1 = new Post(sdf1.parse("21/06/2018 13:05:44"),"Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        p1.addComment(c1);
        p1.addComment(c2);
        
        System.out.println(p1);
        
    }
    
    
    
}
