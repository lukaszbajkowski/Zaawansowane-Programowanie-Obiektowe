package zadanie1;

public class Main {
    public static void main(String[] args) {
        Character shooter = new Character(new ShooterAttack());
        Character archer = new Character(new ArcherAttack());
        Character knight = new Character(new KnightAttack());
        Character gunner = new Character(new GunnerAttack());

        shooter.performAttack();
        archer.performAttack();
        knight.performAttack();
        gunner.performAttack();

        shooter.setAttackStrategy(new GunnerAttack());
        shooter.performAttack();
    }
}
