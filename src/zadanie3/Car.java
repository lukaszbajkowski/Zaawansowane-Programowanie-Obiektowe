package zadanie3;

public class Car {
    private String carName;
    private Driving drivingStrategy;

    public Car(String carName, Driving drivingStrategy) {
        this.carName = carName;
        this.drivingStrategy = drivingStrategy;
    }

    public int getMaxSpeed() {
        return drivingStrategy.getMaxSpeed();
    }

    public String getCarName() {
        return carName;
    }
}

