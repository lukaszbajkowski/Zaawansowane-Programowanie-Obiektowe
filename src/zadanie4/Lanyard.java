package zadanie4;

public class Lanyard implements AdditionalProduct {
    @Override
    public String getDescription() {
        return "Lanyard for pendrive";
    }

    @Override
    public double getPrice() {
        return 1.0;
    }
}

