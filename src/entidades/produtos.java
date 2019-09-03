package entidades;


public class produtos {
    
    private String nome;
    private double preco;
    
    
    public produtos(String nome, double preco){
        
        this.nome = nome;
        this.preco = preco;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void getPreco(double preco){
         this.preco = preco;
    }
    
}
