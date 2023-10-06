package BankAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Exceptions.SoldeInsuffisantException;

public abstract class Account implements IAccount {
    protected String code;
    protected double solde;
    protected Status status;
    protected List<Operation> operations;


    public Account(String code, double solde, Status status) {
        this.code = code;
        this.solde = solde;
        this.status = status;
        this.operations = new ArrayList<>();
    }

    public void effectuerVersement(double montant) {
        if (montant > 0) {
            this.solde += montant;
            Operation operation = new Operation();
            operation.setNumero(generateOperationNumber());
            operation.setDate(getCurrentDate());
            operation.setMontant(montant);
            operation.setType(OperationsType.VERSEMENT);
            operations.add(operation);
        } else {
            System.out.println("Le montant du versement doit être positif.");
        }
    }

    public Status getStatut() {
        return status;
    }
    public void setStatut(Status status) {
        this.status = status;
    }

    private Date getCurrentDate() {
        return null;
    }

    private int generateOperationNumber() {
        return 0;
    }

    public void effectuerRetrait(double montant)throws Exception {
        if(montant >= this.solde)throw new SoldeInsuffisantException("Solde insuffisant");{
            this.solde -= montant;
            Operation operation = new Operation();
            operation.setNumero(generateOperationNumber());
            operation.setDate(getCurrentDate());
            operation.setMontant(montant);
            operation.setType(OperationsType.RETRAIT);
            operations.add(operation);
        }
    }

    public double consulterSolde() {
        return solde;
    }

    public List<Operation> consulterOperations() {
        return operations;
    }
}
