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

class Client {
    final Address address = new Address();
    Phone phone = new Phone();
    Email email = new Email();
    String name;

    public Client(String name, Address address, Phone phone, Email email) {
        this.name = name;
        this.phone =phone;
        this.email= email;
    }
}
