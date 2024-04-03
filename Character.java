public class Character {
    private String name = "";
    private boolean hero = false;
    private int gold;
    private int level;
    private int exp;

    public Character () {
        name = "Anonymous";
        hero = true;
        gold = 0;
        level = 1;
        exp = 0;
    }

    public Character (String initName, boolean initHero) {
        name = initName;
        hero = initHero;
        gold = 0;
        level = 1;
        exp = 0;
    }

    public String getName() {
        return name;
    }

    public boolean getHeroStatus() {
        return hero;
    }

    public void changeHeroStatus(boolean status) {
        hero = status;
    }

    public String toString() {
        return "Name: " + name + "\nHero?: " + hero + "\nGold: " + gold + "\nLevel: " + level;
    }

    public void getRewards(int luck) {
        int increase = (int)(Math.random() * 50 + luck);
        gold += increase;
        System.out.println("You were rewarded " + increase + " gold!");
    }

    public void gainEXP() {
        int count = 0;
        int increase = (int)(Math.random() * 300 + 1);
        exp += increase;
        System.out.println("You gained " + increase + " exp!");
        while (exp > 100) {
            level++;
            exp -= 100;
            count++;
        }
        System.out.println("You leveled up " + count + " times!\nYou are now level " + level + "!");
    }

    public static void main(String[] args) {
        Character nick = new Character("Nick", true);
        System.out.println(nick);
        nick.getRewards((int)Math.random() * 10 + 1);
        System.out.println(nick);
        nick.gainEXP();
        System.out.println(nick);
    }

}