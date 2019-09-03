package entidades;

class No{
    
    public int numero;
    public No prox;
    
    public No(int numero){//CONSTRUTOR
        
        this.numero = numero;       
    }
 
}

public class ListaEncadeada {
    
    private No primeiro;
    
   
    public ListaEncadeada(){//CONSTRUTOR
        
        primeiro = null;
       
    }

    public void InsereListaInicio(int numero){
     
        No novo = new No(numero);
        novo.prox = primeiro;
        primeiro = novo;
    }
    
    public void ImprimeLista(){
        
        No aux = primeiro;
        while(aux != null){
            System.out.printf("%d ", aux.numero);
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
