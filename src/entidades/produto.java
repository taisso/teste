package entidades;

public class produto {
    
    private String nome;
    private double preco;
    private int quantidade;  
    
    public produto(String nome, double preco, int quantidade){//CONSTRUTOR
        
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        
    }
    
    public void setNome(String nome){
        
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double valorTotalEstoque(){
        
        return preco * quantidade;   
    }
    
    public void AdcionaProduto(int quantidade){
        
        this.quantidade += quantidade; 
    }
    
    public void RemoveQuantidade(int quantidade){
        
        this.quantidade -= quantidade; 
    }
    
    public String toString(){///CONVERTE UM OBJETO EM STRING
        
        return nome + ", $ " 
                    + String.format("%.2f", preco) 
                    + ", " 
                    + String.format("%d", quantidade) 
                    + " unidades, Total: $ " + String.format("%.2f", valorTotalEstoque());
    }
    
}
