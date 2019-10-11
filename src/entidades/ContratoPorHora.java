package entidades;

import java.util.Date;


public class ContratoPorHora {
    
    private Date data;
    private Double ValorPorHora;
    private Integer horas;

    
    public ContratoPorHora(){
        
    }
    
    public ContratoPorHora(Date data,Double ValorPorHora ,Integer horas){
        this.data = data;
        this.ValorPorHora = ValorPorHora;
        this.horas = horas;
    }
    
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    
    public double valorTotal(){
        return horas * ValorPorHora;
    }
    
}
