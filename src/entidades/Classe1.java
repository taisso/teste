package entidades;

import model.servicos.NewInterface;


public class Classe1 implements Comparable<Classe1>, NewInterface{

    private String nome;
    private Double salario;
    private Integer idade;

    public Classe1(String nome, Integer idade, Double salario) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    @Override
    public int compareTo(Classe1 outro) {
        return nome.compareTo(outro.getNome());
    }

    @Override
    public double salario(int valor) {
        return salario *= valor;
    }
   
    
    

}
