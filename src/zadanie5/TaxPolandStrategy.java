package zadanie5;

public class TaxPolandStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.23;
    }
}