public class Human extends Character {
    private int health;
    private int maxHealth;

    public Human() {
        super();
        health = 100;
    }

    public Human(String n, boolean h, int initHealth) {
        super(n,h);
        health = initHealth;
        maxHealth = initHealth;
    }

    public String getHealth() {
        return health + "/" + maxHealth;
    }

    // Non-Inherited Methods -------------

    public void healHealth() {
        health += 20;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    // ------------------------------------

    public void getRewards() { // Interesting Method Override
        int increasedLuck = 50;
        super.getRewards((int)Math.random() * 10 + 1 + increasedLuck);
    }

    public String toString() {
        return super.toString() + "\nHealth: " + this.getHealth();
    }

}
