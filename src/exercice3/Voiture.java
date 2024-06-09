package exercice3;

public class Voiture extends Vehicule {
    // Attributs supplémentaires
    private String modele;
    private int annee;

    // Constructeur avec paramètres
    public Voiture(String nom, double prix, String modele, int annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    // Getters et Setters
    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // Redéfinition de la méthode emettreSon()
    @Override
    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }

    // Redéfinition de la méthode afficherInformations()
    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Modèle: " + modele);
        System.out.println("Année: " + annee);
    }
}

