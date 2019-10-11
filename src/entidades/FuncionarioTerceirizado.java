package entidades;


public final class FuncionarioTerceirizado extends Funcionario {
    
    private Double TaxaAdicional;
    
    
    public FuncionarioTerceirizado(){
        super();
    }
    
    public FuncionarioTerceirizado(String nome, Integer horas, Double ValorPorHora, Double TaxaAdicional){
        super(nome, horas, ValorPorHora);
        this.TaxaAdicional = TaxaAdicional;
        
    }
 
    public Double getTaxaAdicional() {
        return TaxaAdicional;
    }

    public void setTaxaAdicional(Double TaxaAdicional) {
        this.TaxaAdicional = TaxaAdicional;
    }
    
     @Override
    public final double FormaPagamento(){
        
        return super.FormaPagamento() + (TaxaAdicional * 110.0)/100;
    }
  
}
