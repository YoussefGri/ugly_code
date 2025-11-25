class Discount {
    private double percentage;

    public Discount(double percentage) {
        this.percentage = percentage;
    }

    public double apply(Money price) {
        double finalAmount = price.getAmount() - (price.getAmount() * percentage / 100);
        return finalAmount;
    }

    @Override
    public String toString() {
        return percentage + "%";
    }
}
