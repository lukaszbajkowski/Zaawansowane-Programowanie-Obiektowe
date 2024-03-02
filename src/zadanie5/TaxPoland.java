package zadanie5;

public class TaxPoland implements Tax {
    @Override
    public double recalculateTax(double price) {
        return price * 0.23;
    }
}