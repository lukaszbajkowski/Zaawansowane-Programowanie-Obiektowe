package zadanie1;

public class Character {
    private AttackStrategy attackStrategy;

    public Character(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setAttack(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }
}
