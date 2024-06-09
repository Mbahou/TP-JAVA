package exercice5;

public class GestionFiguresApp {
    public static void main(String[] args) {
        // Création des objets de différentes figures géométriques
        Cercle cercle = new Cercle("Cercle", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        Triangle triangle = new Triangle("Triangle", 3.0, 4.0, 5.0);

        // Affichage des détails de chaque figure
        cercle.afficherDetails();
        System.out.println();
        rectangle.afficherDetails();
        System.out.println();
        triangle.afficherDetails();
    }
}

