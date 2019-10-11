package model.servicos;


public class BrasilTaxaServico implements TaxaServico{
    
    @Override
    public double taxa(double montante){
        if(montante <= 100.0){
            return montante * 0.2;
        }
        else return montante * 0.15;
        
        
    }
    
}
