package exercice7;

public class CarteCredit extends Paiement {
    // Attribut spécifique à CarteCredit
    private String numeroCarte;

    // Constructeur
    public CarteCredit(double montant, String numeroTransaction, String numeroCarte) {
        super(montant, numeroTransaction);
        this.numeroCarte = numeroCarte;
    }

    // Implémentation de la méthode effectuerPaiement()
    @Override
    public void effectuerPaiement() {
        System.out.println("Paiement de " + montant + " avec la carte de crédit " + numeroCarte + ". Numéro de transaction: " + numeroTransaction);
    }
}

