package praticando_java;

import entidades.Pedido;
import entidades.enumerados;
import java.util.Date;

public class PraticandoEnumeracao {
    
    public static void main(String[] args){
        
        Pedido ordem = new Pedido(1080,new Date(),enumerados.AGUARDANDO_PAGAMENTO);
        
        System.out.println(ordem);
        
        enumerados os1 = enumerados.PROCESSANDO;
        enumerados os2 = enumerados.valueOf("PROCESSANDO");//CONVERTE UMA STRING PARA ENUM
        
        System.out.println(os1);
        System.out.println(os2);
    }
    
    
}
