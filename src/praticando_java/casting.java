package praticando_java;

import java.util.Locale;

public class casting {

    public static void main(String[] args){
        
        String nome = "33";
        double resul, ft = 48.6535;
        
        int a = Integer.parseInt(nome);//CONVERTE A STRING EM NUMERO INTEIRO
        resul = Double.parseDouble(nome);
        
        System.out.println(a);
        System.out.println(resul);
        System.out.printf("%.4f\n", ft);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n", ft);
    }
    
    
}
