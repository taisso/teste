package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ProdutoUsado extends Produto2{
    
    private Date dataFabricacao;
    
    public ProdutoUsado(){
        super();
    }
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public ProdutoUsado(String nome, Double preco, Date dataFabricacao){
        super(nome,preco);
        this.dataFabricacao = dataFabricacao;        
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    @Override
    public final String precoTag(){
        
        return nome + " (Usado)" 
                    + " $ " + String.format("%.2f",preco)
                    + " (" + "Data de fabricação: " + sdf.format(dataFabricacao) + ")";
    }
    
}
