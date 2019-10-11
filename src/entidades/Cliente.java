package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Cliente {
    
   private String nome; 
   private String email;
   private Date birthDate;
   private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
   
   public Cliente(){
       
   }
   public Cliente(String nome, String email, Date bithDate){
       
       this.nome = nome;
       this.birthDate = bithDate;
       this.email = email;
       
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBithDate() {
        return birthDate;
    }

    public void setBithDate(Date bithDate) {
        this.birthDate = bithDate;
    }
    
    public String toString(){
        
        return nome + " (" + sdf.format(birthDate) + ") - " + email;
    }
    
}
