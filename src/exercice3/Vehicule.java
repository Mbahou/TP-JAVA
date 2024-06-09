package exercice3;

public class Vehicule {
    // Attributs
    private String nom;
    private double prix;

    // Constructeur avec paramètres
    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Méthode pour émettre un son générique
    public void emettreSon() {
        System.out.println("Le véhicule émet un son inconnu.");
    }

    // Méthode pour afficher les informations de base
    public void afficherInformations() {
        System.out.println("Nom: " + nom);
        System.out.println("Prix: " + prix);
    }
}

