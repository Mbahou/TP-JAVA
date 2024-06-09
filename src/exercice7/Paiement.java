package exercice7;

    public class Paiement {
        // Attributs communs à tous les moyens de paiement
        protected double montant;
        protected String numeroTransaction;

        // Constructeur
        public Paiement(double montant, String numeroTransaction) {
            this.montant = montant;
            this.numeroTransaction = numeroTransaction;
        }

        // Méthode pour effectuer le paiement (à redéfinir dans les sous-classes)
        public void effectuerPaiement() {
            System.out.println("Effectuer un paiement de " + montant);
        }
    }

