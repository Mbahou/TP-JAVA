package exercice5;

public class Cercle extends Figure {
    // Attribut pour le rayon du cercle
    private double rayon;

    // Constructeur
    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    // Méthode pour calculer l'aire
    @Override
    public double calculerAire() {
        return Math.PI * Math.pow(rayon, 2);
    }

    // Méthode pour calculer le périmètre
    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
}

