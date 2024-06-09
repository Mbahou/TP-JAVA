package exercice7;

public class GestionPaiementApp {
    public static void main(String[] args) {
        // Création des moyens de paiement
        CarteCredit carteCredit = new CarteCredit(100.0, "TR1", "4111111111111111");
        PayPal payPal = new PayPal(200.0, "TR2", "example@example.com");

        // Création des commandes
        Commande commande1 = new Commande(100.0, carteCredit);
        Commande commande2 = new Commande(200.0, payPal);

        // Traitement des paiements
        commande1.processPayment();
        commande2.processPayment();
    }
}

