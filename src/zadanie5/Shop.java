package zadanie5;

public class Shop {
    public static void main(String[] args) {

        OnlineShop polandShop = new OnlineShop(new TaxPoland());
        double pricePL = polandShop.recalculateProductValue(10.0);
        System.out.println("PL " + pricePL);

        OnlineShop gbShop = new OnlineShop(new TaxGB());
        double priceGB = gbShop.recalculateProductValue(10.0);
        System.out.println("GB " + priceGB);

        OnlineShop germanShop = new OnlineShop(new TaxD());
        double priceD = germanShop.recalculateProductValue(10.0);
        System.out.println("D " + priceD);
    }
}