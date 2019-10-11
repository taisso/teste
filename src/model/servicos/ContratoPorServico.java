package model.servicos;

import entidades.Contrato;
import entidades.Prestacao;
import java.util.Calendar;
import java.util.Date;


public class ContratoPorServico {

    private PagamentoOnlinePorServico pag;

    
    public ContratoPorServico(PagamentoOnlinePorServico pag) {
        this.pag = pag;
    
    }

    public void ProcessoContrato(Contrato contrat, Integer interador){
        
        double rec = contrat.getValorTotal() / interador;
        
        for(int i = 1; i <= interador; i++){
            rec += pag.pagamentoGratis(rec);
            rec += pag.Interesse(rec, i);
            contrat.adiciona(new Prestacao(alteraData(contrat,i), rec));
            rec = contrat.getValorTotal() / interador;
        }
        
    }
  
    private Date alteraData(Contrato contrat, Integer interador){
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(contrat.getData());
        cal.add(Calendar.MONTH, interador);
        return cal.getTime();
        
    }
    
    
    
}
