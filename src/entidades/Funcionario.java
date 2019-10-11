package entidades;


public class Funcionario {
    
    private String nome;
    private Integer horas;
    private Double ValorPorHoras;
    
    
    public Funcionario(){
        
    }
    public Funcionario(String nome, Integer horas, Double ValorPorHora){
        
        this.nome = nome;
        this.horas = horas;
        this.ValorPorHoras = ValorPorHora;
        
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorPorHoras() {
        return ValorPorHoras;
    }

    public void setValorPorHoras(Double ValorPorHoras) {
        this.ValorPorHoras = ValorPorHoras;
    }
    
     public double FormaPagamento(){
        return horas * ValorPorHoras;
    }
    
}
