package BankAccount;

import java.util.Date;

public class CourantAccount extends Account {

    private double decouvert;


    public CourantAccount(String code, double solde, Status status,double decouvert) {
        super(code, solde, status);
        this.decouvert=decouvert;
    }


    @Override
    public void effectuerRetrait(double montant) {
        double soldeAvecDecouvert = solde - decouvert;

    if (montant > 0) {
        if (soldeAvecDecouvert >= montant) {
            this.solde -= montant;
            Operation operation = new Operation();
            operation.setNumero(generateOperationNumber());
            operation.setDate(getCurrentDate());
            operation.setMontant(-montant);
            operation.setType(OperationsType.RETRAIT);
            operations.add(operation);
        } else {
            System.out.println("Le retrait dépasse le découvert autorisé.");
        }
    } else {
        System.out.println("Le montant du retrait doit être positif.");
    }
    }

    private Date getCurrentDate() {
        return null;
    }

    private int generateOperationNumber() {
        return 0;
    }
}
