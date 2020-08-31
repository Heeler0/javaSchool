package ee.taltech;

import ee.taltech.game.Character;
import ee.taltech.game.Monster;
import ee.taltech.game.Weapon;

import java.util.ArrayList;

public class ReadyPlayerTwo {

    public static void main(String[] args) {
        //todo player two
        // 1 create yourself a new character, [pull, commit and push]
        // 2 find a way to define Intelligence for your character, [pull, commit and push]
        // 3 create a class Weapon.java in package ee.taltech.game, add necessary properties, [pull, commit and push]
        // 4 equip your character with some first class epic OMG weapon, [pull, commit and push]
        // 5 create a list of at 3 monsters, [pull, commit and push]
        // 6 define each monster to have 11 strength and 444 intelligence, [pull, commit and push]
        // 7 create a fight method in Fight.java which takes in a character + a list of monsters
        //  If character (strength + intelligence) > sum of monster (strength + intelligence) then you win.
        //  [pull, commit and push]
        // 8 fight the monsters, [pull, commit and push]
        // 9 There is a very bad big boss monster. You need to train your Strength and Intelligence to defeat them.
        // For that define trainIntelligence method in Character.java
        // You also need trainStrength method in Character.java, however this is done by your teammate.
        // [pull, commit and push]
        // 10 Fight and win! Print out that you won. [pull, commit and push]

        Character playerTwo = new Character("Hansukene");
        Weapon epicWeapon = new Weapon("Maiused",1);
        playerTwo.setWeapon(epicWeapon);
        ArrayList<Monster> monsters = new ArrayList<>();
        Monster monster1 = new Monster("Hunt");
        monsters.add(monster1);
        Monster monster2 = new Monster("Karu");
        monsters.add(monster2);
        Monster monster3 = new Monster("Koer");
        monsters.add(monster3);


    }
}
