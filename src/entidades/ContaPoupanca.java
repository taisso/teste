package entidades;

public final class ContaPoupanca extends Account{
    
    private Double taxajuros;
    
    public ContaPoupanca(){
        super();
    }
    public ContaPoupanca(Integer numero, String holder, Double balance, Double taxajuros){
        super(numero, holder, balance);//CHAMA O CONSTRUTOR DA SUPERCLASSE "Account"
        this.taxajuros = taxajuros;
    }

    public Double getTaxajuros() {
        return taxajuros;
    }

    public void setTaxajuros(Double taxajuros) {
        this.taxajuros = taxajuros;
    }
    public void atualizasaldo(){
        balance += balance * taxajuros;
    }
    
    @Override //SOBREPOSIÇÃO DA SUPERCLASSE "Account"
    public final void saque(double valor){
        balance -= valor;
    }
    
}
