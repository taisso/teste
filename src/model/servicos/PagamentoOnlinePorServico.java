package model.servicos;


public interface PagamentoOnlinePorServico {
    
    Double pagamentoGratis(Double montante);
    Double Interesse(Double montante, Integer interador);

}
