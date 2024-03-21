package zadanie3;

public interface Pizza {
    String getDescription();
    double getCost();
}

class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Podstawowa pizza";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
