package praticando_java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Program11 {
    
    public static void main(String[] args) {
        
        Set<Integer> s = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        
        char letra = 'A';
        for(int i = 1; i <= 3; i++){
            System.out.print("Quantos códigos vai digitar na turma " + letra++ + "? ");
            int n = sc.nextInt();
            
            for(int j = 1; j <= n; j++){
                s.add(sc.nextInt());

            }
        }
        
        System.out.println("Total de estudantes: " + s.size());
        
        
    }
    

}
