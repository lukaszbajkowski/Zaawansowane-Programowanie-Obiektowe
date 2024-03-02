package zadanie5;

public class TaxD implements Tax {
    @Override
    public double recalculateTax(double price) {
        return price * 0.19;
    }
}