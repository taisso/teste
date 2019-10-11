package praticando_java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.Exception.DomainException;
import model.entidades.Reservation;


public class Program6 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try{

            System.out.print("Room Nunber: ");
            int number = input.nextInt();
            input.nextLine();

            System.out.print("Data de Check-in(DD/MM/YYYY): ");
            Date checkIn = sdf.parse(input.nextLine());

            System.out.print("Data de Check-out(DD/MM/YYYY): ");
            Date checkOut = sdf.parse(input.nextLine());



            Reservation reser = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reser);
            System.out.println();

            System.out.print("Data de Check-in(DD/MM/YYYY): ");
            checkIn = sdf.parse(input.nextLine());

            System.out.print("Data de Check-out(DD/MM/YYYY): ");
            checkOut = sdf.parse(input.nextLine());

            reser.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reser);
        }
        catch(ParseException e){
            System.out.println("Invalid date format");
            
        }
        catch(DomainException e){
            
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e){
            
                System.out.println("Erro");
        }
        
        input.close();
    }
    
}
