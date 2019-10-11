package entidades;

public  final class ProdutoImportado extends Produto2{
    
    private Double custoPreco;
    
    
    public ProdutoImportado(){
        super();
    }
    
    public ProdutoImportado(String nome, Double preco, Double custoPreco){
        super(nome,preco);
        this.custoPreco = custoPreco;
    }

    public Double getCustoPreco() {
        return custoPreco;
    }

    public void setCustoPreco(Double custoPreco) {
        this.custoPreco = custoPreco;
    }
    
    public double precoTotal(){
        return custoPreco + preco;
    }
    
    
    @Override
    public final String precoTag(){
        
       return nome + "$ " 
                   + String.format("%.2f", precoTotal())
                   + " (" + "Custo do frete: $ " 
                   + String.format("%.2f", custoPreco) + ")";
    }
    
    
}
