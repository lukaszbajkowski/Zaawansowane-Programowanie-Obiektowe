package zadanie5;

public class Shop {
    public static void main(String[] args) {

        OnlineShop onlineShop = new OnlineShop(10.0, 10.0, 10.0);

        onlineShop.setTax(new TaxPL());
        double pricePL = onlineShop.getPricePL();
        System.out.println("PL " + pricePL);

        onlineShop.setTax(new TaxGB());
        double priceGB = onlineShop.getPriceGB();
        System.out.println("GB " + priceGB);

        onlineShop.setTax(new TaxD());
        double priceD = onlineShop.getPriceD();
        System.out.println("D " + priceD);
    }
}
