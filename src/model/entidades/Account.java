package model.entidades;


public class Account {
    
    private Integer numero;
    private String suporte;
    private Double saldo;
    private Double retirarLimite;
    
    public Account(){
        
    }
   
    public Account(Integer numero, String suporte, Double saldo, Double retirarLimite){
        
        this.numero = numero;
        this.suporte = suporte;
        this.saldo = saldo;
        this.retirarLimite = retirarLimite;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getSuporte() {
        return suporte;
    }

    public void setSuporte(String suporte) {
        this.suporte = suporte;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getRetirarLimite() {
        return retirarLimite;
    }
    
    public void deposito(Double depos){
        
        saldo += depos;
    }
    
    public void saque(Double saq){
        
        if(saldo < saq){
            
            throw new IllegalArgumentException("Não saldo na sua conta suficiente para realizar o saque!");
        }
        if(saq > retirarLimite){
            
            throw new IllegalArgumentException("O valor excede o limite da conta!");
        }
        
        saldo -= saq;
    }
    
}
