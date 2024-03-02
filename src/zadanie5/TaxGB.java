package zadanie5;

public class TaxGB implements Tax {
    @Override
    public double recalculateTax(double price) {
        return price * 0.2;
    }
}