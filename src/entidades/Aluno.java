package entidades;


public class Aluno {
    
    public String nome;
    public double nota1, nota2, nota3;
    
    public double somaNotas(){
        
        return nota1 + nota2 + nota3;
    }
    public double avaliarAluno(){
        
        return 60.0 - somaNotas();
        
    }
}