package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Contrato {
    
    private Integer numero;
    private Date data;
    private Double ValorTotal;
    
    private List<Prestacao> lista = new ArrayList<>();


    public Contrato(Integer numero, Date data, Double ValorTotal) {
        this.numero = numero;
        this.data = data;
        this.ValorTotal = ValorTotal;
    }
    
  
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(Double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

   public void adiciona(Prestacao prestacao){   
       lista.add(prestacao);
   }
    
   public void remove(Prestacao prestacao){
       lista.remove(prestacao);
   } 

    public List<Prestacao> getLista() {
        return lista;
    }

   
   
   
}
