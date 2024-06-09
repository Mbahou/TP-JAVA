package exercice3;

public class Avion extends Vehicule {
    // Attributs supplémentaires
    private String compagnie;
    private int vitesseMax;

    // Constructeur avec paramètres
    public Avion(String nom, double prix, String compagnie, int vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    // Getters et Setters
    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    // Redéfinition de la méthode emettreSon()
    @Override
    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant.");
    }

    // Redéfinition de la méthode afficherInformations()
    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Compagnie: " + compagnie);
        System.out.println("Vitesse max: " + vitesseMax + " km/h");
    }
}
