package zadanie5;

public class OnlineShop {
    private final Tax tax;
    public OnlineShop(Tax tax) {
        this.tax = tax;
    }
    public double recalculateProductValue(double price) {
        double taxAmount = tax.recalculateTax(price);
        return price + taxAmount;
    }
}