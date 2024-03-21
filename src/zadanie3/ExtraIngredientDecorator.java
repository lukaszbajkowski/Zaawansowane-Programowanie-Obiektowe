package zadanie3;

class ExtraIngredientDecorator extends PizzaDecorator {
    private String ingredient;
    private double cost;

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
