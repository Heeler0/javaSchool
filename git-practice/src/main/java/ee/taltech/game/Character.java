package ee.taltech.game;

public class Character {
    private String name;

    private int intelligence = 0;
    private int strength = 0;


    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
