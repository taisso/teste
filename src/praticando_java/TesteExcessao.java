package praticando_java;

import model.Exception.DomainException;


public class TesteExcessao {
    
    private static void aumentarLetras() throws DomainException //lançando exceção
    {
        String frase = null;
        String novaFrase = null;
        try
        {
            novaFrase = frase.toUpperCase();
        }
        catch(NullPointerException e)
        {
            throw new DomainException(e.getMessage());
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }
    
      
    public static void main(String[] args){
               
         try
        {
            aumentarLetras();
        }
        catch(DomainException e)
        {
            System.out.println("Ocorreu uma excessão ao " + "executar o método aumentarLetras() " + e);
        }
    }
}
