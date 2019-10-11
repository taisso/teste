package model.servicos;

import entidades.AluguelCarro;
import entidades.Fatura;


public class AluguelServico {
 
    private Double precoPorDia;
    private Double precoPorHora;
    
    private TaxaServico taxaServico;

    public AluguelServico(Double precoPorDia, Double precoPorHora, TaxaServico taxaServico) {
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.taxaServico = taxaServico;
       
    }

  
    
    public void processoFatura(AluguelCarro aluguelCarro){
        
        long t1 = aluguelCarro.getInicio().getTime();
        long t2 = aluguelCarro.getFim().getTime();
        
        double horas = (double)(t2 - t1) / 1000 / 60 / 60;
        double valorBasicoPagamento;
        
        if(horas <= 12.0){
            valorBasicoPagamento = Math.ceil(horas / 24) * precoPorHora;
        }
        else{
            
            valorBasicoPagamento = Math.ceil(horas) * precoPorDia;
        }
        double taxa = taxaServico.taxa(valorBasicoPagamento);
        aluguelCarro.setFatura(new Fatura(valorBasicoPagamento, taxa));
    }
    
}
