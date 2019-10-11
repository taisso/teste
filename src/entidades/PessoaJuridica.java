package entidades;


public class PessoaJuridica extends TaxPlayer{
    
    
    private Integer quantFuncionario;
    
    public PessoaJuridica(){
        
    }
    public PessoaJuridica(String nome, Double valorAnual, Integer quantFuncionario){
        super(nome, valorAnual);
        this.quantFuncionario = quantFuncionario;
    }
    
    @Override
    public double taxa(){
        
        double resu;
        if(quantFuncionario > 10){
            resu = super.getValorAnual() * 0.14;
        }
        else{
            resu = super.getValorAnual() * 0.16;
        }
        return resu;
    }
    
}
