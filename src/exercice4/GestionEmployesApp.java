package exercice4;

public class GestionEmployesApp {
    public static void main(String[] args) {
        // Déclaration et instanciation d'un ingénieur
        Ingenieur ingenieur = new Ingenieur("Dupont", "Jean", "jean.dupont@example.com", "0612345678", 3000, "Développement logiciel");

        // Déclaration et instanciation d'un manager
        Manager manager = new Manager("Martin", "Sophie", "sophie.martin@example.com", "0698765432", 4000, "Informatique");

        // Affichage des informations de l'ingénieur et du manager
        System.out.println(ingenieur.toString());
        System.out.println(manager.toString());
    }
}

