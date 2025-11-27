/**
 * Exemple de code présentant le code smell "Primitive Obsession".
 *
 * Défaut : Trop d'informations sont représentées sous forme de primitives (String, int, double)
 * alors qu'elles devraient être encapsulées dans des classes spécifiques.
 *
 * Problème :
 * - Les coordonnées d’un client (adresse, ville, code postal, pays) sont manipulées comme des Strings.
 * - Le prix, la devise, la remise et le total sont représentés uniquement par des doubles ou des Strings.
 * - Le numéro de téléphone et l’email sont également de simples chaînes.
 *
 * Correction visée (refactoring) :
 * - Créer des classes dédiées : Address, Price, Email, PhoneNumber…
 * - Encapsuler la logique (ex : validation d’email, format du téléphone, règle de calcul du prix…)
 * - Améliorer la lisibilité et réduire les erreurs liées à la manipulation brute des primitives.
 *
 * Ce programme fonctionne correctement, mais il est conçu pour être refactoré pendant le TP.
 */

public class PrimitiveObsessionDemo {

    public static void printClientInfo(Client c) {
        System.out.println("Client: " + c.name);
        System.out.println("Adresse : " + c.address + ", " + c.city + " " + c.postalCode + ", " + c.country);
        System.out.println("Téléphone : " + c.phone);
        System.out.println("Email : " + c.email);
    }

    public static void printOrderInfo(Order o) {
        System.out.println("Produit : " + o.productName);
        System.out.println("Prix initial : " + o.price + " " + o.currency);
        System.out.println("Remise : " + o.discountPercentage + "%");
        System.out.println("Prix final : " + o.computeFinalPrice() + " " + o.currency);
    }

    public static void main(String[] args) {

        // Création d'un client (avec primitives au lieu d'objets dédiés)
        Client c = new Client(
                "Youssef Grari",
                "123 Rue Imaginaire",
                "Montpellier",
                "34000",
                "France",
                "0666001122",
                "youssef@example.com"
        );

        // Création d’une commande avec primitives pour le prix et la devise
        Order o1 = new Order(
                "Ordinateur Portable",
                1200.0,
                10.0,
                "EUR"
        );

        Order o2 = new Order(
                "Souris Gaming",
                30.0,
                5.0,
                "EUR"
        );

        // Tests exhaustifs
        System.out.println("=== Informations Client ===");
        printClientInfo(c);

        System.out.println("\n=== Détail Commande 1 ===");
        printOrderInfo(o1);

        System.out.println("\n=== Détail Commande 2 ===");
        printOrderInfo(o2);

        System.out.println("\n=== Tests supplémentaires ===");
        System.out.println("Prix final attendu o1 >= 0 : " + (o1.computeFinalPrice() >= 0));
        System.out.println("Prix final attendu o2 >= 0 : " + (o2.computeFinalPrice() >= 0));
    }
}