package exercice2;

public class BibliothequeApp {
    public static void main(String[] args) {
        // Déclaration et instanciation d'un adhérent
        Adherent adherent1 = new Adherent("Dupont", "Jean", "jean.dupont@example.com", "0123456789", 30, 1001);

        // Déclaration et instanciation d'un auteur
        Auteur auteur1 = new Auteur("Martin", "Paul", "paul.martin@example.com", "0987654321", 45, 5001);

        // Déclaration et instanciation d'un livre écrit par l'auteur
        Livre livre1 = new Livre(123456, "Le Mystère de l'Étoile", auteur1);

        // Affichage des informations de l'adhérent et du livre
        System.out.println("Informations de l'adhérent:");
        System.out.println(adherent1.toString());
        System.out.println();

        System.out.println("Informations du livre:");
        System.out.println(livre1.toString());
    }
}
