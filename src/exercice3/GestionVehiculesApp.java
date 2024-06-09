package exercice3;

public class GestionVehiculesApp {
    public static void main(String[] args) {
        // Création d'une voiture
        Voiture voiture1 = new Voiture("Voiture Sport", 50000, "Sport GT", 2022);

        // Création d'une moto
        Moto moto1 = new Moto("Moto Rapide", 15000, "Yamaha", 200);

        // Création d'un avion
        Avion avion1 = new Avion("Avion de Ligne", 1500000, "Air France", 900);

        // Appel des méthodes pour chaque véhicule
        System.out.println("Informations et son de la voiture:");
        voiture1.afficherInformations();
        voiture1.emettreSon();
        System.out.println();

        System.out.println("Informations et son de la moto:");
        moto1.afficherInformations();
        moto1.emettreSon();
        System.out.println();

        System.out.println("Informations et son de l'avion:");
        avion1.afficherInformations();
        avion1.emettreSon();
        System.out.println();
    }
}
