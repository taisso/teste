package ContaBancario;

public class ContaCliente {
    
    private int nConta;
    private String nome;  //ATRIBUTOS
    private double valor;
    
    
    public ContaCliente(int nConta, String nome, double valor){//CONSTRUTOR
        
        this.nConta = nConta;
        this.nome = nome;
        saldoConta(valor);
    }
    
    public ContaCliente(int nConta, String nome){///SOBRECARGA
        
        this.nConta = nConta;
        this.nome = nome;
        
    }
    
    public String getNome(){
        return nome;
    }
    
     public int getnConta(){
        return nConta;
    }
     
      public double getValor(){
        return valor;
    }
    
    public void saldoConta(double valor){
        
        this.valor += valor;
        
    }
    
    public void saqueConta(double valor){
        
        this.valor = this.valor - 5.00 - valor;
        
    }
    
    public String toString(){
        
        return "Conta " + String.format("%d", getnConta())
                        + ", Titular: "
                        + String.format("%s", getNome())
                        + ", Valor: "
                        + String.format("%.2f\n", getValor());
        
    }
    
}
