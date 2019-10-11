package entidades;

public class ContaEmpresarial extends Account{
    
    private Double limite;
    
    public ContaEmpresarial(){
        super();
        
    }
    public ContaEmpresarial(Integer numero, String holder, Double balance, Double limite){
        super(numero,holder,balance);//CHAMA O CONSTRUTOR DA SUPER CLASSE "Account"
        this.limite = limite;
        
    }
    public ContaEmpresarial(Integer numero, String holder, Double balance){
        super(numero,holder,balance);//CHAMA O CONSTRUTOR DA SUPER CLASSE "Account"       
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
    public void emprestimoConta(double valor){
        if(valor <= limite){
            balance += valor - 10.0;
        }
    }
    
    @Override //SOBREPOSIÇÃO DA SUPERCLASSE "Account"
    public final void saque(double valor){
        super.saque(valor);//CHAMA O METÓDO SAQUE DA SUPERCLASSE
        balance -= valor;
    }
}
