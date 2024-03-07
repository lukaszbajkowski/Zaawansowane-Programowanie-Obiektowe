package zadanie5;

public class TaxD implements Tax {
    @Override
    public double calculateTax(double price) {
        return price * 0.19;
    }
}