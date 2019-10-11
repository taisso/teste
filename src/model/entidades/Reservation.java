package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import model.Exception.DomainException;


public class Reservation {
    
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut)throws DomainException{
        
        if(!checkOut.after(checkIn)){
           
           throw new DomainException("Error in reservation: Check-out date must be after check-in date");
           
       }
        
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }
    public long duration(){
        long dif = Math.abs(checkIn.getTime() - checkOut.getTime());//RETORNA A DIFERENÇA EM MILISSEGUNDOS
                                                          //get.Time()RETORNA O VALOR EM MILISSEGUUNDOS DA DATA
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);//CONVERTE O VALOR EM MILISSEGUNDOS EM DIAS
    }               
    
    public void updateDates(Date checkIn, Date checkOut) throws DomainException{
        
      Date novo = new Date();
        
       if(checkIn.before(novo) || checkOut.before(novo)){
           
           throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
       }
       if(!checkOut.after(checkIn)){
           
           throw new DomainException("Error in reservation: Check-out date must be after check-in date");
           
       }
       
       this.checkIn = checkIn;
       this.checkOut = checkOut;
       
    }
    
    @Override
    public String toString(){
        
        return "Room " + roomNumber
                       + ", Check-in: "
                       + sdf.format(checkIn)
                       + ", Check-out: "
                       + sdf.format(checkOut)
                       + ", "
                       + duration()
                       + " neights";
    }
    
}
