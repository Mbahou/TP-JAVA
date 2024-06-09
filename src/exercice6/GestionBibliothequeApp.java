package exercice6;

public class GestionBibliothequeApp {
    public static void main(String[] args) {
        // Création des objets Livre
        Livre livre1 = new Livre("Les Misérables", "Victor Hugo");
        Livre livre2 = new Livre("1984", "George Orwell");

        // Création des objets DVD
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");
        DVD dvd2 = new DVD("The Matrix", "The Wachowskis");

        // Création de l'utilisateur
        Utilisateur utilisateur = new Utilisateur("Alice");

        // Emprunter des objets
        utilisateur.emprunterObjet(livre1);
        utilisateur.emprunterObjet(dvd1);

        // Essayer de ré-emprunter le même objet
        utilisateur.emprunterObjet(livre1);

        // Retourner des objets
        utilisateur.retournerObjet(livre1);
        utilisateur.retournerObjet(dvd1);

        // Essayer de retourner un objet non emprunté
        utilisateur.retournerObjet(livre2);

        // Affichage des informations
        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(dvd1);
        System.out.println(dvd2);
        System.out.println(utilisateur);
    }
}

