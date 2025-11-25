public class PrimitiveObsessionDemo {

    public static void printClientInfo(Client c) {
        System.out.println("Client: " + c.name);
        System.out.println(
                "Adresse : " + c.address.getAddress() + ", " +
                        c.address.getCity() + " " +
                        c.address.getPostalCode() + ", " +
                        c.address.getCountry()
        );
        System.out.println("Téléphone : " + c.phone.phone);
        System.out.println("Email : " + c.email.email);
    }

    public static void printOrderInfo(Order o) {
        System.out.println("Produit : " + o.productName);
        System.out.println("Prix initial : " + o.money.price + " " + o.money.currency);
        System.out.println("Remise : " + o.discountPercentage + "%");
        System.out.println("Prix final : " + o.computeFinalPrice() + " " + o.money.currency);
    }

    public static void main(String[] args) {

        // === Construction des objets encapsulés ===

        Address addr = new Address();
        addr.setAddress("123 Rue Imaginaire");
        addr.setCity("Montpellier");
        addr.setPostalCode("34000");
        addr.setCountry("France");

        Phone phone = new Phone("0666001122");
        Email email = new Email("youssef@example.com");

        Client c = new Client(
                "Youssef Grari",
                addr,
                phone,
                email
        );

        // === Commande 1 ===
        Money m1 = new Money(1200.0, "EUR");
        Order o1 = new Order(
                "Ordinateur Portable",
                10.0,
                m1
        );

        // === Commande 2 ===
        Money m2 = new Money(30.0, "EUR");
        Order o2 = new Order(
                "Souris Gaming",
                5.0,
                m2
        );

        // === Affichage ===
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
