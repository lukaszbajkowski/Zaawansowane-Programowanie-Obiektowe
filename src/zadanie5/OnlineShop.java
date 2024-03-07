package zadanie5;

public class OnlineShop {
    private final double pricePL;
    private final double priceGB;
    private final double priceD;

    private Tax tax;

    public OnlineShop(double pricePL, double priceGB, double priceD) {
        this.pricePL = pricePL;
        this.priceGB = priceGB;
        this.priceD = priceD;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public double getPricePL() {
        if (tax == null) {
            throw new IllegalStateException("Tax strategy not set");
        }

        return pricePL + tax.calculateTax(pricePL);
    }

    public double getPriceGB() {
        if (tax == null) {
            throw new IllegalStateException("Tax strategy not set");
        }

        return priceGB + tax.calculateTax(priceGB);
    }

    public double getPriceD() {
        if (tax == null) {
            throw new IllegalStateException("Tax strategy not set");
        }

        return priceD + tax.calculateTax(priceD);
    }
}
