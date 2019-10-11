package model.servicos;


public class PagamentoPorServico implements PagamentoOnlinePorServico{
    
    public static final double PORCENT = 0.01;
    public static final double PORCENT2 = 0.02;
    
    @Override
    public Double pagamentoGratis(Double montante){
        
        return montante * PORCENT2;
        
    }
    
    
    @Override
    public Double Interesse(Double montante, Integer interador){
        return montante * PORCENT * interador;
    }

}
