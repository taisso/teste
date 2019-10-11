package entidades;


public class Produto2 {
    
    protected String nome;
    protected Double preco;
    
    public Produto2(){
        
    }
    public Produto2(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String precoTag(){
        
        return nome + "$ " + String.format("%.2f",preco);
    }
    
    
}
