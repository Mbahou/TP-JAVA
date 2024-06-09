package exercice4;

public class Manager extends Employe {
    // Attribut supplémentaire
    private String service;

    // Constructeur avec paramètres
    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    // Getter et Setter
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    // Redéfinition de la méthode calculerSalaire()
    @Override
    public double calculerSalaire() {
        return getSalaire() * 1.20;
    }

    // Méthode pour afficher les informations
    @Override
    public String toString() {
        return "Manager [Nom=" + getNom() + ", Prenom=" + getPrenom() + ", Email=" + getEmail() + ", Telephone=" + getTelephone() +
                ", Salaire=" + calculerSalaire() + ", Service=" + service + "]";
    }
}
