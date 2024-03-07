package zadanie5;

public class TaxPL implements Tax {
    @Override
    public double calculateTax(double price) {
        return price * 0.23;
    }
}