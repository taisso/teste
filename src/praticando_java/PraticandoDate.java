package praticando_java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class PraticandoDate {
    
    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date x1 = new Date();
        Date x2 = sdf1.parse("05/09/2019 09:43:33");
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(x1);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        Date y1 = cal.getTime();
        
        System.out.println(sdf1.format(y1));
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(sdf1.format(x2));
        System.out.println(sdf1.format(x1));
    }
    
    
    
}
