package exercice5;

public abstract class Figure {
    // Attribut protégé pour le nom de la figure
    protected String nom;

    // Constructeur
    public Figure(String nom) {
        this.nom = nom;
    }

    // Méthode abstraite pour calculer l'aire
    public abstract double calculerAire();

    // Méthode abstraite pour calculer le périmètre
    public abstract double calculerPerimetre();

    // Méthode pour afficher les détails de la figure
    public void afficherDetails() {
        System.out.println("Nom: " + nom);
        System.out.println("Aire: " + calculerAire());
        System.out.println("Périmètre: " + calculerPerimetre());
    }
}
