package praticando_java;

import java.util.Scanner;


public class ex_matriz {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Linha e coluna: ");
        int linha = input.nextInt();
        int coluna = input.nextInt();
        int[][] mat = new int[linha][coluna];
        
        System.out.print("Valor: ");
        int x = input.nextInt();
         
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                mat[i][j] = input.nextInt();
            }
        }
        
        System.out.println();
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                if(mat[i][j] == x){    
                    
                    if(j > 0){
                       System.out.println("Left: " + mat[i][j - 1]);
                    }
                    else if(j < coluna - 1){
                       System.out.println("Right: " + mat[i][j + 1]);
                    }
                    else if(i > 0){
                       System.out.println("Up: " + mat[i - 1][j]);
                    }
                    else if(i < linha - 1){
                       System.out.println("Down: " + mat[i + 1][j]);
                    }
            }
        }
    }    
        
        
    }
    
    
}
