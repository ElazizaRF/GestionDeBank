package BankAccount;

import java.util.Date;

public class Retrait extends Operation{
    public Retrait(int numero, Date date, double montant) {
        super(numero, date, montant, OperationsType.RETRAIT);
    }
}
