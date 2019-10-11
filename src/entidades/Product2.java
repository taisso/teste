package entidades;


public class Product2 implements Comparable<Product2>{
    
    private String nome;
    private Double preco;

    public Product2() {
    }

    public Product2(String nome, Double preco) {
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
    
    public static boolean staticProduct2Predicate(Product2 p){
        return p.getPreco() >= 200.00;
    }
    
    public boolean noStaticProduct2Predicate(){
        return preco >= 200.00;
    }
    
    public static String staticProduct2Function(Product2 p) {
    	return p.getNome().toUpperCase();
    }
    
    public String nostaticProduct2Function() {
    	return nome.toUpperCase();
    }

    @Override
    public String toString(){
        
        return nome + ", " + String.format("%.2f", preco);
        
    }
    
    @Override
    public int compareTo(Product2 outro){
        return preco.compareTo(outro.getPreco());
       
    }
    

}
