package exercice1;


    public class Compte {
        // Attributs
        private String numero;
        private double solde;
        private static int nbComptes = 0;

        // Constructeur sans paramètres
        public Compte() {
            this.numero = "";
            this.solde = 0.0;
            nbComptes++;
        }

        // Getters et Setters
        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public double getSolde() {
            return solde;
        }

        public void setSolde(double solde) {
            this.solde = solde;
        }

        // Méthode pour déposer un montant sur le compte
        public void deposer(double montant) {
            this.solde += montant;
        }

        // Méthode pour retirer un montant du solde
        public void retirer(double montant) {
            if (solde >= montant) {
                this.solde -= montant;
            } else {
                System.out.println("Solde insuffisant pour retirer " + montant);
            }
        }

        // Méthode pour afficher les informations du compte
        public void afficherCompteInfo() {
            System.out.println("Numéro de compte: " + numero);
            System.out.println("Solde: " + solde);
        }

        // Méthode statique pour afficher le nombre de comptes créés
        public static void afficherNbComptes() {
            System.out.println("Nombre de comptes créés: " + nbComptes);
        }
    }
