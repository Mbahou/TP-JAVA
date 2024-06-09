package exercice6;


public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private boolean estEmprunte;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.estEmprunte = false;
    }

    @Override
    public void emprunter() {
        if (!estEmprunte) {
            estEmprunte = true;
            System.out.println(titre + " de " + auteur + " a été emprunté.");
        } else {
            System.out.println(titre + " de " + auteur + " est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (estEmprunte) {
            estEmprunte = false;
            System.out.println(titre + " de " + auteur + " a été retourné.");
        } else {
            System.out.println(titre + " de " + auteur + " n'était pas emprunté.");
        }
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", estEmprunte=" + estEmprunte +
                '}';
    }
}

