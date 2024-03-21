package zadanie3;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        System.out.println("Opis: " + pizza.getDescription() + ", Koszt: " + pizza.getCost() + " zł");

        Pizza pizzaWithExtraCheese = new ExtraIngredientDecorator(pizza, "extra ser", 2.0);
        System.out.println("Opis: " + pizzaWithExtraCheese.getDescription() + ", Koszt: " + pizzaWithExtraCheese.getCost() + " zł");

        Pizza pizzaWithoutOnions = new WithoutIngredientDecorator(pizzaWithExtraCheese, "cebula");
        System.out.println("Opis: " + pizzaWithoutOnions.getDescription() + ", Koszt: " + pizzaWithoutOnions.getCost() + " zł");
    }
}
