package entidades;

public class SalarioFuncionario {
 
    private String nome;
    private int id;
    private double salario;
    
    
    public SalarioFuncionario(String nome, int id, double salario){
        
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        
    }
    public int getId(){
        return id;
    }
    
    public void IncrementoSalario(double porcentegem){
        
        salario += salario * porcentegem / 100;
    }
    public String toString(){
        
        return String.format("%d, %s, %.2f", id, nome, salario);
    }
    
    
}
