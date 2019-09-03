package entidades;


public class retangulo {
    
    public double altura;
    public double largura;
    
    
    public double area(){
        
        return altura * largura;   
    }
    public double perimetro(){
        
        return 2 * altura + 2 * largura;
        
    }
    public double diagonal(){
        
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }
}
