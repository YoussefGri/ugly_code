class Order {
    String productName;
    double price;
    double discountPercentage;
    String currency;

    public Order(String productName, double price, double discountPercentage, String currency) {
        this.productName = productName;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.currency = currency;
    }

    public double computeFinalPrice() {
        return price - (price * discountPercentage / 100);
    }
}
