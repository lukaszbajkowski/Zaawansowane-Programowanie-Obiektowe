package zadanie3;

public class WithoutIngredientDecorator extends PizzaDecorator {
    private final String omittedIngredient;

    public WithoutIngredientDecorator(Pizza pizza, String omittedIngredient) {
        super(pizza);
        this.omittedIngredient = omittedIngredient;
    }

    @Override
    public String getDescription() {
        String description = pizza.getDescription();
        if (description.contains(omittedIngredient)) {
            description = description.replace(", " + omittedIngredient, "");
        }
        return description + ", without " + omittedIngredient;
    }

    @Override
    public double getCost() {
        return super.getCost();
    }
}
