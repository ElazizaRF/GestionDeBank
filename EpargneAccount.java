package BankAccount;

public class EpargneAccount extends Account {

    private double tauxInterets;

    public EpargneAccount(String code, double solde, Status status,double tauxInterets) {
        super(code, solde, status);
        this.tauxInterets=tauxInterets;
    }


    public void miseAJourSolde() {
        this.solde += this.solde * tauxInterets;
    }
}
