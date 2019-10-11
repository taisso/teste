package praticando_java;

import entidades.Account;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;
import java.util.Collection;
import java.util.Collections;


public class Heranca_polimorfisomo {
    
    public static void main(String[] args){
        
        
        //Account acc = new Account(1001, "Alex", 0.0);
        ContaEmpresarial bacc = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);
        
        //UPCASTING
        
        Account acc1 = bacc;
        Account acc2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
        Account acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
        
        
        //DOWNCASTING
        
        ContaEmpresarial acc4 = (ContaEmpresarial)acc2;
        acc4.emprestimoConta(100.0);
        
        //ContaEmpresarial acc5 = (ContaEmpresarial)acc3;ERRO!
       
        if(acc3 instanceof ContaEmpresarial){
            ContaEmpresarial acc5 = (ContaEmpresarial)acc3;
            acc5.emprestimoConta(200.0);
            System.out.println("Empréstimo");
        }
        if(acc3 instanceof ContaPoupanca){
            ContaPoupanca acc5 = (ContaPoupanca)acc3;
            //acc5.atualizasaldo();
            System.out.println("Atualizado!");
                        
        }
        
        
        //Account acc5 = new Account(1001, "Alex", 1000.0);
        //acc5.saque(200.0);
        //System.out.println(acc5.getBalance());
        
        
        Account acc6 = new ContaPoupanca(1004, "Anna", 1000.0, 0.01);
        
        
        acc6.saque(200.0);//CHAMA O METÓDO SOBREPOSTO DA "ContaPoupanca"
        System.out.println(acc6.getBalance());
        
        
    }
    
}
