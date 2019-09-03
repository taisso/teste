package praticando_java;

import java.util.Scanner;


public class Matriz{
    
    public static void main(String[] args){
        
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt(), cont = 0;
        int[][] mat = new int[n][n];
       
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = input.nextInt();
                if(mat[i][j] < 0)cont++;
            }
        }
        System.out.println("\nDiagonal principal: ");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i == j){
                    System.out.printf("%d ", mat[i][j]);
                }
                
            }
        }
        System.out.println("\nNúmeros negativos = " + cont);
        
        input.close();
        
    }
    
    
}