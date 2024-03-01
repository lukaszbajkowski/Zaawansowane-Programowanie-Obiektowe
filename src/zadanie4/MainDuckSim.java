package zadanie4;

import java.util.ArrayList;

public class MainDuckSim {
    public static void main(String[] args) {
        ArrayList<Duck> kaczki = new ArrayList<>();

        Duck kaczka1 = new MallardDuck(new Quack(), new FlyWithWings());

        kaczki.add(kaczka1);
        kaczki.add(new RuberDuck(new Squeak(), new FlyNoWay()));
        kaczki.add(new ModelDuck(new MuteQuack(), new FlyNoWay()));

        for(Duck a:kaczki) {
            a.performFly();
            a.performQuack();
        }

        kaczki.get(1).setFlyBehavior(() -> System.out.println("Duck is flying using a jetpack"));

        kaczki.get(1).performFly();
    }
}
