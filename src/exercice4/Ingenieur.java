package exercice4;

public class Ingenieur extends Employe {
    // Attribut supplémentaire
    private String specialite;

    // Constructeur avec paramètres
    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    // Getter et Setter
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    // Redéfinition de la méthode calculerSalaire()
    @Override
    public double calculerSalaire() {
        return getSalaire() * 1.15;
    }

    // Méthode pour afficher les informations
    @Override
    public String toString() {
        return "Ingenieur [Nom=" + getNom() + ", Prenom=" + getPrenom() + ", Email=" + getEmail() + ", Telephone=" + getTelephone() +
                ", Salaire=" + calculerSalaire() + ", Specialite=" + specialite + "]";
    }
}

