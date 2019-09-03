package entidades;

class No{
    
    public Object info;
    public No prox;
    
    public No(int info){//CONSTRUTOR
        
        this.info = info;       
    }
 
}

public class ListaEncadeada {
    
    private No primeiro;
    
   
    public ListaEncadeada(){//CONSTRUTOR
        
        primeiro = null;
       
    }

    public void InsereListaInicio(int info){
     
        No novo = new No(info);
        novo.prox = primeiro;
        primeiro = novo;
    }
    
    public void ImprimeLista(){
        
        No aux = primeiro;
        while(aux != null){
            System.out.printf("%d ", aux.info);
            aux = aux.prox;
        }
        
    }
    
    public void LiberaLista(){
        
        No aux = primeiro;
        while(aux != null){
            No temp = aux.prox;
            aux = null;
            aux = temp;
        }
        primeiro = null;
    }
    
}
