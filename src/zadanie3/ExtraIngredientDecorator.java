package zadanie3;
// ExtraIngredientDecorator.java
public class ExtraIngredientDecorator extends PizzaDecorator {
    private final String ingredient;
    private final double cost;

    public ExtraIngredientDecorator(Pizza pizza, String ingredient, double cost) {
        super(pizza);
        this.ingredient = ingredient;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", " + ingredient;
    }

    @Override
    public double getCost() {
        return pizza.getCost() + cost;
    }
}
