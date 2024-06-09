package exercice6;

public class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean estEmprunte;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.estEmprunte = false;
    }

    @Override
    public void emprunter() {
        if (!estEmprunte) {
            estEmprunte = true;
            System.out.println(titre + " de " + realisateur + " a été emprunté.");
        } else {
            System.out.println(titre + " de " + realisateur + " est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (estEmprunte) {
            estEmprunte = false;
            System.out.println(titre + " de " + realisateur + " a été retourné.");
        } else {
            System.out.println(titre + " de " + realisateur + " n'était pas emprunté.");
        }
    }

    @Override
    public String toString() {
        return "DVD{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", estEmprunte=" + estEmprunte +
                '}';
    }
}
