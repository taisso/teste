package entidades;


public abstract class TaxPlayer {
    
    private String nome;
    private Double valorAnual;
    
    public TaxPlayer(){
        
    }
    
    public TaxPlayer(String nome, Double valorAnual){
        this.nome = nome;
        this.valorAnual = valorAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorAnual() {
        return valorAnual;
    }

    public void setValorAnual(Double valorAnual) {
        this.valorAnual = valorAnual;
    }
    
    public abstract double taxa();
    
    
    
}
