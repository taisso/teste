package entidades;


public class PessoaFisica extends TaxPlayer{
        
    private Double gastoSaude;
    
    public PessoaFisica(){
      super();   
    }
    public PessoaFisica(String nome, Double valorAnual, Double gastoSaude){
        super(nome, valorAnual);
        this.gastoSaude = gastoSaude;
    }
    
   
    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }
    
    @Override
     public double taxa(){
         
         if(super.getValorAnual() < 20000.00){
             return super.getValorAnual() * 0.15 - gastoSaude * 0.50;
         }
         else{ 
             return super.getValorAnual() * 0.25 - gastoSaude * 0.50;
         }
     }
}
