package BankAccount;

import Compte.Compte;

public class VirementOperation {
    private Compte compteSource;
    private Compte compteDestinataire;
    private double montant;

    public void effectuerVirement() {
        if (compteSource != null && compteDestinataire != null && montant > 0) {
            if (compteSource.solde >= montant) {
                compteSource.effectuerRetrait(montant);
                compteDestinataire.effectuerVersement(montant);
                System.out.println("Virement effectué avec succès.");
            } else {
                System.out.println("Le solde du compte source est insuffisant pour effectuer le virement.");
            }
        } else {
            System.out.println("Virement invalide.");
        }    }
}