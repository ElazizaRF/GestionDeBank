package BankAccount;

import java.util.Date;

public class Versement extends Operation{
    public Versement(int numero, Date date, double montant) {
        super(numero, date, montant, OperationsType.VERSEMENT);
    }
}
