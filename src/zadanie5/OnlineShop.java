package zadanie5;

public class OnlineShop {
    private final double pricePL;
    private final double priceGB;
    private final double priceD;

    private TaxStrategy taxStrategy;

    public OnlineShop(double pricePL, double priceGB, double priceD) {
        this.pricePL = pricePL;
        this.priceGB = priceGB;
        this.priceD = priceD;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double getPricePL() {
        if (taxStrategy == null) {
            throw new IllegalStateException("Tax strategy not set");
        }

        return pricePL + taxStrategy.calculateTax(pricePL);
    }

    public double getPriceGB() {
        if (taxStrategy == null) {
            throw new IllegalStateException("Tax strategy not set");
        }

        return priceGB + taxStrategy.calculateTax(priceGB);
    }

    public double getPriceD() {
        if (taxStrategy == null) {
            throw new IllegalStateException("Tax strategy not set");
        }

        return priceD + taxStrategy.calculateTax(priceD);
    }
}
