class Order {
    private String productName;
    private Money price;
    private Discount discount;

    public Order(String productName, Money price, Discount discount) {
        this.productName = productName;
        this.price = price;
        this.discount = discount;
    }

    public double computeFinalPrice() {
        return discount.apply(price);
    }

    @Override
    public String toString() {
        return "Produit: " + productName +
                "\nPrix initial: " + price +
                "\nRemise: " + discount +
                "\nPrix final: " + computeFinalPrice() + " " + price.getCurrency();
    }
}
