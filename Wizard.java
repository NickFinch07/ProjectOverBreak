public class Wizard extends Human{
    private int magicPower;

    public Wizard() {
        super();
        magicPower = 100;
    }

    public Wizard(String n, boolean h, int health, int initMagicPower) {
        super(n,h,health);
        magicPower = initMagicPower;
    }

    public int getMagicPower() {
        return magicPower;
    }
    // Non-Inherited Methods ---------------------

    public void castSpell(int powerRequired) {
        magicPower -= powerRequired;
        if (magicPower < 0) {
            magicPower = 0;
        }
    }

    public void gainMagicPower(int powerGained) {
        magicPower += powerGained;
    }

    // -------------------------------------------

    public void healHealth() { // Interesting Method Override
        super.healHealth();
        super.healHealth();
        magicPower += 20;
    }

    public String toString() {
        return super.toString() + "\nMagic Power: " + this.getMagicPower();
    }

}
