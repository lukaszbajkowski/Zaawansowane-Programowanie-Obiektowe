package zadanie4;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<AdditionalProduct> additionalProducts = new ArrayList<>();
    private final List<Product> products = new ArrayList<>();
    private double discount = 0.0;

    public void addProduct(AdditionalProduct product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            additionalProducts.add(product);
        }
    }

    public void addProduct(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(product);
        }
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculateTotalPrice() {
        double price = additionalProducts.stream().mapToDouble(AdditionalProduct::getPrice).sum();
        price += products.stream().mapToDouble(Product::getPrice).sum();
        price -= discount;
        return price;
    }

    public void displayContent() {
        System.out.println("Purchased products:");
        for (AdditionalProduct product : additionalProducts) {
            System.out.println("- " + product.getDescription());
        }
        for (Product product : products) {
            System.out.println("- " + product.getName() + " - price: " + product.getPrice() + " PLN");
        }
    }
}

