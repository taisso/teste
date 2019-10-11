package entidades;

import model.servicos.Soma;


public class Teste_soma implements Soma{

    public Teste_soma() {
    }
    
    public int retonarSoma(int a){
        return a + 1;
    }

    
    @Override
    public int soma_valores(int a, int b){
        return a + b;
    }
    

}
