package zadanie5;

public class OnlineShop {
    private Tax tax;

    public OnlineShop(Tax tax) {
        this.tax = tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public double recalculateTax(double cena) {
        double tax = this.tax.calculateTax(cena);
        return cena + tax;
    }

    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop(new TaxPL());
        double pricePL = shop.recalculateTax(100.0);
        System.out.println("Cena w Polsce to: " + pricePL);

        shop.setTax(new TaxD());
        double priceD = shop.recalculateTax(100.0);
        System.out.println("Cena w Niemczech to: " + priceD);

        shop.setTax(new TaxGB());
        double priceUK = shop.recalculateTax(100.0);
        System.out.println("Cena w Wielkiej Brytanii to: " + priceUK);
    }
}