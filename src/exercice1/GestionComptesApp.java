package exercice1;

public class GestionComptesApp {
    public static void main(String[] args) {
        // Créer un compte bancaire
        Compte compte1 = new Compte();
        compte1.setNumero("123456");
        compte1.deposer(1000.0);

        // Afficher les informations du compte après dépôt
        System.out.println("Après dépôt initial:");
        compte1.afficherCompteInfo();
        System.out.println();

        // Effectuer un retrait
        compte1.retirer(500.0);
        System.out.println("Après retrait de 500:");
        compte1.afficherCompteInfo();
        System.out.println();

        // Essayer de retirer un montant supérieur au solde
        compte1.retirer(600.0);
        System.out.println("Après tentative de retrait de 600:");
        compte1.afficherCompteInfo();
        System.out.println();

        // Déposer un autre montant
        compte1.deposer(200.0);
        System.out.println("Après dépôt de 200:");
        compte1.afficherCompteInfo();
        System.out.println();

        // Afficher le nombre de comptes créés
        Compte.afficherNbComptes();
    }
}
