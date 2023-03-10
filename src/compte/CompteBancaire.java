package compte;

public class CompteBancaire {

    private double balance;
    private int num_compte;
    public static int nombre_compte=0;

    public double getBalance() {
        return balance;
    }
    public int getNum_compte(){
        return num_compte;
    }
    public void setBalance(double balance){
        this.balance=balance;
        nombre_compte+=1;
    }

    public CompteBancaire(){
        this.balance=0.0;
        this.num_compte=0;
        nombre_compte+=1;
    }
    public CompteBancaire(double balance,int num_compte){
        this.balance=balance;
        this.num_compte=num_compte;
    }

    @Override
    public String toString() {
        return "compte.CompteBancaire{" +
                "balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompteBancaire)) return false;
        CompteBancaire that = (CompteBancaire) o;
        return Double.compare(that.balance, balance) == 0 && num_compte == that.num_compte;
    }

    public void deposit (double montant){
        this.balance+=montant;

    }
    public void withdraw(double montant){
        this.balance-=montant;

    }
    public static void afficher_nombre_client(){
        System.out.println("le nombre de client actuel est "+nombre_compte);
    }
}
