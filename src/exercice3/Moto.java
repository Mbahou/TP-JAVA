package exercice3;

public class Moto extends Vehicule {
    // Attributs supplémentaires
    private String marque;
    private int puissance;

    // Constructeur avec paramètres
    public Moto(String nom, double prix, String marque, int puissance) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    // Getters et Setters
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    // Redéfinition de la méthode emettreSon()
    @Override
    public void emettreSon() {
        System.out.println("La moto rugit.");
    }

    // Redéfinition de la méthode afficherInformations()
    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Marque: " + marque);
        System.out.println("Puissance: " + puissance + " chevaux");
    }
}

