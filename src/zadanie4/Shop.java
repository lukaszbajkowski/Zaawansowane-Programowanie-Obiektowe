package zadanie4;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("Welcome to the shop!");

        System.out.println("Do you want to add the store mascot? (Y/N)");
        if (scanner.nextLine().equalsIgnoreCase("Y")) {
            System.out.println("Enter the quantity of mascots:");
            int mascotQuantity = scanner.nextInt();
            cart.addProduct(new Mascot(), mascotQuantity);
            scanner.nextLine();
        }

        System.out.println("Do you want to add a lanyard for pendrive? (Y/N)");
        if (scanner.nextLine().equalsIgnoreCase("Y")) {
            System.out.println("Enter the quantity of lanyards:");
            int lanyardQuantity = scanner.nextInt();
            cart.addProduct(new Lanyard(), lanyardQuantity);
            scanner.nextLine();
        }

        // Adding other products (statically defined)
        cart.addProduct(new Product("Mug", 10.0), 2);
        cart.addProduct(new Product("Pen", 5.0), 3);

        System.out.println("Do you want to apply a discount of 10 PLN? (Y/N)");
        if (scanner.nextLine().equalsIgnoreCase("Y")) {
            cart.setDiscount(10.0);
        }

        double totalPrice = cart.calculateTotalPrice();
        totalPrice += 13.0;
        if (totalPrice < 0) {
            totalPrice = 0.0;
        }

        cart.displayContent();
        System.out.println("Total price: " + totalPrice + " PLN");

        scanner.close();
    }
}
