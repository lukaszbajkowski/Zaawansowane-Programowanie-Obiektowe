package zadanie1;

public class Main {
    public static void main(String[] args) {
        // Tworzymy postaci o różnych typach
        Character shooter = new Character(new ShooterAttack());
        Character archer = new Character(new ArcherAttack());
        Character knight = new Character(new KnightAttack());
        Character gunner = new Character(new GunnerAttack());

        // Postacie wykonują ataki
        shooter.performAttack();
        archer.performAttack();
        knight.performAttack();
        gunner.performAttack();

        // Zmiana strategii ataku dla strzelca
        shooter.setAttackStrategy(new GunnerAttack());
        shooter.performAttack();
    }
}