package exercice5;

public class Triangle extends Figure {
    // Attributs pour les côtés du triangle
    private double coteA;
    private double coteB;
    private double coteC;

    // Constructeur
    public Triangle(String nom, double coteA, double coteB, double coteC) {
        super(nom);
        this.coteA = coteA;
        this.coteB = coteB;
        this.coteC = coteC;
    }

    // Méthode pour calculer l'aire
    @Override
    public double calculerAire() {
        double s = (coteA + coteB + coteC) / 2;
        return Math.sqrt(s * (s - coteA) * (s - coteB) * (s - coteC));
    }

    // Méthode pour calculer le périmètre
    @Override
    public double calculerPerimetre() {
        return coteA + coteB + coteC;
    }
}

