package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    
    private Date moment;
    private OrderStatus status;
    
    private List<OrderIten> itens = new ArrayList<>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Cliente cliente;
    
    
    public Order(){
    }
    
    public Order(Date moment, OrderStatus status, Cliente cliente){
        
        this.cliente = cliente;
        this.moment = moment;
        this.status = status;
        
    }
 
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderIten> getItens() {
        return itens;
    }
  
    public void addIntem(OrderIten iten){
        itens.add(iten);
    }
    public void removeIntem(OrderIten iten){
        itens.remove(iten);
    }
    public double total(){
        
        double soma = 0;
        for(OrderIten c : itens){
            soma += c.subTotal();
        }
        return soma;
    }
    public String toString(){
        
        StringBuilder sp = new StringBuilder();
        
        sp.append("ORDER SUMMARY:\n");
        sp.append("Order moment: " + sdf.format(moment) + '\n');
        sp.append("Order status: " + status + '\n');
        sp.append("Client: " + cliente.getNome());
        sp.append(cliente + "\n");
        sp.append("Order items:\n");
        for(OrderIten iten : itens){
            sp.append(iten.toString());
        }
        sp.append("Total price: $" + String.format("%.2f", total()) + '\n');
        return sp.toString();
    }
}
