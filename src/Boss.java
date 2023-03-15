public class Boss {
    int health;
    int damage;
    String defence;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getDefence() {
        return defence;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefence(String attackType) {
        this.defence = attackType;
    }
}
