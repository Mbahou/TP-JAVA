package exercice5;


    public class Rectangle extends Figure {
        // Attributs pour la longueur et la largeur du rectangle
        private double longueur;
        private double largeur;

        // Constructeur
        public Rectangle(String nom, double longueur, double largeur) {
            super(nom);
            this.longueur = longueur;
            this.largeur = largeur;
        }

        // Méthode pour calculer l'aire
        @Override
        public double calculerAire() {
            return longueur * largeur;
        }

        // Méthode pour calculer le périmètre
        @Override
        public double calculerPerimetre() {
            return 2 * (longueur + largeur);
        }
    }

