package entidades;

import java.util.Date;

public class Pedido {
    
    private Integer id;
    private Date momento;
    private enumerados status;
    
    
    public Pedido(){
        
    }
    
    public Pedido(Integer id, Date momento, enumerados status){
        
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

   
    public Integer getId() {
        return id;
    }

    
    public Date getMomento() {
        return momento;
    }

    
    public enumerados getStatus() {
        return status;
    }
    
    public String toString(){
        
        return "id = " + id + " momento = " + momento + " status = " + status; 
    }
    
}
