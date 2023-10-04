package BankAccount;

import java.util.Date;

public class Operation {
    private int numero;
    private Date date;
    private double montant;
    private OperationsType type;
    

    //Constructeurs
    public Operation(int numero,Date date,double montant,OperationsType type){
        this.numero=numero;
        this.date=date;
        this.montant=montant;
        this.type=type;
    }

    public Operation(){};

    //Getters
    public Date getDate() {
        return date;
    }
    public double getMontant() {
        return montant;
    }
    public int getNumero() {
        return numero;
    }
    public OperationsType getType() {
        return type;
    }


    //Setters
    public void setDate(Date date) {
        this.date = date;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setType(OperationsType type) {
        this.type = type;
    }
    public String toString() {
        return "Operation{" +
                "numero=" + numero +
                ", date=" + date +
                ", montant=" + montant +
                ", type=" + type +
                '}';
    }
}