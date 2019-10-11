package praticando_java;

import java.util.Scanner;


public class string {
    
    
    public static void main(String[] args){
        
        String original = " abcde FGHIJ ABC abc DEFG ";
        String copia = "Taisso Reni De Souza Melo";
        String copia2 = "taisso ReNi De Souza Melo";
        Scanner input = new Scanner(System.in);
        
        
        String s01 = original.toLowerCase();//DEIXA TUDO EM MINÚSCULA
        String s02 = original.toUpperCase();//DEIXTA TUDO EM MAÍSCULA
        String s03 = original.trim();//RETIRA OS ESPAÇOS ANTES E DEPOIS A STRING
        String s04 = original.substring(2);//CRIA UMA NOVA STRING A PARTI DE UMA POSIÇÃO 
        String s05 = original.substring(2,9);
        String s06 = original.replace('a','x');
        String s07 = original.replace("abc","xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        String[] s08 = copia.split(" ");
        
        
        System.out.println("Original: -" + original + "-");
        System.out.println(copia.compareToIgnoreCase(copia2));
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("subtring(2): -" + s04 + "-");
        System.out.println("subtring2(2,9): -" + s05 + "-");
        System.out.println("replace(a,x): -" + s06 + "-");
        System.out.println("replace(abc,xy): -" + s07 + "-");
        System.out.println("indexOf(bc): -" + i + '-');
        System.out.println("lastIndexOf(bc): -" + j + '-');
        System.out.println(s08[0]);
        
        String var1 = "Texto complexo";
        String var2 = "Texto ";
        
        System.out.println("String são iguais? " + var2.equals(var1));
        System.out.println("String contém? " + var1.contains(var2));
        //equals compara duas expressões são iguais
        //contains verifica se uma expressão está contida em outra
        //RETORNAM true ou false
    }
    
    
}
