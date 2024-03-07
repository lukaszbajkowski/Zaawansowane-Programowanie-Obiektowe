package zadanie3;

public class Main {
    public static void main(String[] args) {
        Car normalCar = new Car("Normal Car", new NormalDriving());
        Car sportsCar = new Car("Sports Car", new SportsDriving());

        CarSpeed normalCarSpeed = new CarSpeed(normalCar);
        normalCarSpeed.showCarName();
        System.out.println("Max speed: " + normalCarSpeed.getMaxSpeed());

        CarSpeed sportsCarSpeed = new CarSpeed(sportsCar);
        sportsCarSpeed.showCarName();
        System.out.println("Max speed: " + sportsCarSpeed.getMaxSpeed());
    }
}
