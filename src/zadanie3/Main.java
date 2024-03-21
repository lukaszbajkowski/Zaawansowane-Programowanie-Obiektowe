package zadanie3;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        System.out.println("Pizza: " + pizza.getDescription() + ", Cost: " + pizza.getCost() + " zł");

        Pizza pizzaWithExtraCheese = new ExtraIngredientDecorator(pizza, "extra cheese", 2.0);
        System.out.println("Pizza: " + pizzaWithExtraCheese.getDescription() + ", Cost: " + pizzaWithExtraCheese.getCost() + " zł");

        Pizza pizzaWithoutOnions = new WithoutIngredientDecorator(pizzaWithExtraCheese, "onion");
        System.out.println("Pizza: " + pizzaWithoutOnions.getDescription() + ", Cost: " + pizzaWithoutOnions.getCost() + " zł");

        Pizza pizzaWithoutPepperAndOnion = new WithoutIngredientDecorator(pizza, "pepper");
        pizzaWithoutPepperAndOnion = new WithoutIngredientDecorator(pizzaWithoutPepperAndOnion, "onion");
        System.out.println("Pizza: " + pizzaWithoutPepperAndOnion.getDescription() + ", Cost: " + pizzaWithoutPepperAndOnion.getCost() + " zł");
    }
}
