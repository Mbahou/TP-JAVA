package exercice6;


public class Utilisateur {
    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public void emprunterObjet(Empruntable objet) {
        objet.emprunter();
    }

    public void retournerObjet(Empruntable objet) {
        objet.retourner();
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
