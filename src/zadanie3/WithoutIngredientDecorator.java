package zadanie3;

class WithoutIngredientDecorator extends PizzaDecorator {
    private String ingredient;

    public WithoutIngredientDecorator(Pizza pizza, String ingredient) {
        super(pizza);
        this.ingredient = ingredient;
    }

    @Override
    public String getDescription() {
        String description = pizza.getDescription();
        if (description.contains(ingredient)) {
            description = description.replace(ingredient, "bez " + ingredient);
        }
        return description;
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
