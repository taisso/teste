package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Nivel {
    
    private String nome;
    private NivelFuncionario nivel;
    private Double BaseSalario;
    
    private Departamento departamento;
    private List<ContratoPorHora> contratos = new ArrayList<>();
    
    public Nivel(){
        
    }
    
    public Nivel(String nome, NivelFuncionario nivel, Double BaseSalario, Departamento departamento){
        this.nome = nome;
        this.nivel = nivel;
        this.BaseSalario = BaseSalario;
        this.departamento = departamento;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelFuncionario getNivel() {
        return nivel;
    }

    public void setNivel(NivelFuncionario nivel) {
        this.nivel = nivel;
    }

    public Double getBaseSalario() {
        return BaseSalario;
    }

    public void setBaseSalario(Double BaseSalario) {
        this.BaseSalario = BaseSalario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoPorHora> getContratos() {
        return contratos;
    }
    
    public void adicionaContrato(ContratoPorHora contratos){
        this.contratos.add(contratos);
    }
    
    public void removeContrato(ContratoPorHora contratos){
        this.contratos.remove(contratos);
    }
    
    public double renda(int ano, int mes){
        
        double soma = BaseSalario;
        Calendar cal = Calendar.getInstance();
        
        for(ContratoPorHora c : contratos){
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            
            if(ano == c_ano && c_mes == mes){
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
