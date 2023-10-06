package BankAccount;

import java.util.List;

public interface IAccount {
    public void effectuerVersement(double montant);
    public void effectuerRetrait(double montant) throws Exception;
    public double consulterSolde();
    public List<Operation> consulterOperations();
}
