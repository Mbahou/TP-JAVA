package exercice7;

public class Commande {
    // Attributs
    private double montant;
    private Paiement moyenPaiement;

    // Constructeur
    public Commande(double montant, Paiement moyenPaiement) {
        this.montant = montant;
        this.moyenPaiement = moyenPaiement;
    }

    // Méthode pour traiter le paiement
    public void processPayment() {
        moyenPaiement.effectuerPaiement();
    }
}
