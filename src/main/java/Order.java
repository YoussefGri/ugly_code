class Order {
    final Money money = new Money();
    String productName;
    double discountPercentage;


    public Order(String productName,  double discountPercentage , Money money) {
        this.productName = productName;
        this.discountPercentage = discountPercentage;
        this.money.price = money.price;
    }

    public double computeFinalPrice() {
        return money.price - (money.price * discountPercentage / 100);
    }
}
