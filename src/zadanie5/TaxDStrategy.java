package zadanie5;

public class TaxDStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.19;
    }
}