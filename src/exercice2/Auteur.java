package exercice2;


    public class Auteur extends Personne {
        // Attribut spécifique à Auteur
        private int numAuteur;

        // Constructeur avec paramètres
        public Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur) {
            super(nom, prenom, email, tel, age);
            this.numAuteur = numAuteur;
        }

        // Redéfinition de la méthode toString()
        @Override
        public String toString() {
            return super.toString() + ", Numéro d'auteur: " + numAuteur;
        }
    }


