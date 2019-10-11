package entidades;


public class OrderIten {
    
    private Integer quantidade;
    private Double preco;
    
    private Product info;
    
    public OrderIten(){
        
    }
    public OrderIten(Integer quantidade, Double preco, Product info){
        this.preco = preco;
        this.quantidade = quantidade;
        this.info = info;
    }    
    
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Product getInfo() {
        return info;
    }

    public void setInfo(Product info) {
        this.info = info;
    }
    public double subTotal(){
        return quantidade * preco;
    }
    
    public String toString(){
        
        StringBuilder sp = new StringBuilder();
        sp.append(info.getNome() + ", " );
        sp.append("$" + String.format("%.2f", preco) + ", ");
        sp.append("Quantity: " + quantidade + ", ");
        sp.append("Subtotal: $" + String.format("%.2f", subTotal()) + '\n');
        return sp.toString();
    }
}
