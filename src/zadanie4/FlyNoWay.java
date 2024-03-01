package zadanie4;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("This duck does not fly.");
    }
}
