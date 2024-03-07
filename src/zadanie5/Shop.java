package zadanie5;

public class Shop {
    public static void main(String[] args) {

        OnlineShop onlineShop = new OnlineShop(10.0, 10.0, 10.0);

        onlineShop.setTaxStrategy(new TaxPolandStrategy());
        double pricePL = onlineShop.getPricePL();
        System.out.println("PL " + pricePL);

        onlineShop.setTaxStrategy(new TaxGBStrategy());
        double priceGB = onlineShop.getPriceGB();
        System.out.println("GB " + priceGB);

        onlineShop.setTaxStrategy(new TaxDStrategy());
        double priceD = onlineShop.getPriceD();
        System.out.println("D " + priceD);
    }
}
