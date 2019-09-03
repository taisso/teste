package entidades;


public class Quartos {
    
    private String nome, Email;
    private Integer quarto; //Wrapper

    public Quartos(String nome, String Email, int quarto){
        
        this.nome = nome;
        this.Email = Email;
        this.quarto = quarto;
        
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public int getQuarto(){
        return quarto;
    }
    public String toString(){
        
        return String.format("%s, %s",nome, Email);
    }
    
}
