public class PrimitiveObsessionDemo {

    public static void printClientInfo(Client c) {
        System.out.println("Client : \n" + c);
    }

    public static void printOrderInfo(Order o) {
        System.out.println(o);
    }

    public static void main(String[] args) {

        Client c = new Client(
                "Youssef Grari",
                new Address("123 Rue Imaginaire", "Montpellier", "34000", "France"),
                new PhoneNumber("0666001122"),
                new Email("youssef@example.com")
        );

        Order o1 = new Order(
                "Ordinateur Portable",
                new Money(1200.0, "EUR"),
                new Discount(10.0)
        );

        Order o2 = new Order(
                "Souris Gaming",
                new Money(30.0, "EUR"),
                new Discount(5.0)
        );

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
