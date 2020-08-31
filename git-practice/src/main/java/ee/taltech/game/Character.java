package ee.taltech.game;

public class Character {
    private String name;

    private int intelligence = 0;

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
}
