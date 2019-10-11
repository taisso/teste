package praticando_java;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class Data_calendar {
    
    public static void main(String[] args){
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf1.format(d));

        
        Calendar cal = Calendar.getInstance();//FAZENDO A INSTANCIAÇÃO
        cal.setTime(d);///ADICIONAR A DATA NO CALENDAR
        cal.add(Calendar.HOUR_OF_DAY, 4);//ACRESCENTA 4 HORAS NO HORÁRIO
        d = cal.getTime();///ATUALIZA A DATA
        
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(new Date());
        cal2.add(Calendar.HOUR_OF_DAY, 4);
        Date f = cal2.getTime();
        System.out.println("Aqui: " + f);
        
        System.out.println(sdf1.format(d));
        System.out.println("------------------------");
        
        int minutos = cal.get(Calendar.MINUTE);
        int mes = 1 + cal.get(Calendar.MONTH);
        System.out.println("Minutos: " + minutos);
        System.out.println("Mes: " + mes);
        
    }
    
    
}
