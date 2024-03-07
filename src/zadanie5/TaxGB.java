package zadanie5;

public class TaxGB implements Tax {
    @Override
    public double calculateTax(double price) {
        return price * 0.2;
    }
}