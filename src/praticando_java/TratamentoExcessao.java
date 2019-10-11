package praticando_java;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TratamentoExcessao {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        try{
            String[] vect = input.nextLine().split(" ");
            int pos = input.nextInt();
            System.out.println(vect[pos]);
        }
        catch(ArrayIndexOutOfBoundsException c){//QUANDO DIGITAR UMA POSIÇÃO ALÉM DO VETOR
            System.out.println("Posição invalida!");
        }
        catch(InputMismatchException c){//CASO SEJA DIGITADO UM ALGO DIFERENTE DO TIPO int
            System.out.println("Valor inválido!");
        }
        
        
    }
    
}
