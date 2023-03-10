package compte;

import java.io.Console;

public class TestCompteBancaire {

    public static  void main(String args[]){
        CompteBancaire cb1=new CompteBancaire();
        System.out.println(cb1.toString());
        System.out.println(cb1.getNum_compte()+" est le numero de compte");
        cb1.deposit(500000);
        System.out.println("la nouvelle balance est : "+cb1.getBalance());
        cb1.withdraw(5000);
        System.out.println("la nouvelle balance est : "+cb1.getBalance());
        System.out.println("le nombre de compte est : "+CompteBancaire.nombre_compte);
        CompteBancaire cb2=new CompteBancaire();
        System.out.println("le nombre de compte est : "+CompteBancaire.nombre_compte);


    }
}
