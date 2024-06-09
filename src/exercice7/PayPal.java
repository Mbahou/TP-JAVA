package exercice7;

public class PayPal extends Paiement {
    // Attribut spécifique à PayPal
    private String email;

    // Constructeur
    public PayPal(double montant, String numeroTransaction, String email) {
        super(montant, numeroTransaction);
        this.email = email;
    }

    // Implémentation de la méthode effectuerPaiement()
    @Override
    public void effectuerPaiement() {
        System.out.println("Paiement de " + montant + " via PayPal avec l'email " + email + ". Numéro de transaction: " + numeroTransaction);
    }
}

