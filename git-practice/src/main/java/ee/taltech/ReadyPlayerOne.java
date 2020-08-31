package ee.taltech;

import ee.taltech.game.Character;
import ee.taltech.game.Monster;
import ee.taltech.game.Weapon;

import java.util.ArrayList;

public class ReadyPlayerOne {

    public static void main(String[] args) {
        //todo player one
        // 1 create yourself a new character, [pull, commit and push]
        // 2 find a way to define Strength for your character, [pull, commit and push]
        // 3 create a class Weapon.java in package ee.taltech.game, add necessary properties, [pull, commit and push]
        // 4 equip your character with some first class epic OMG weapon, [pull, commit and push]
        // 5 create a list of at 3 monsters, [pull, commit and push]
        // 6 define each monster to have 222 strength and 33 intelligence, [pull, commit and push]
        // 7 create a fight method in Fight.java which takes in a character + a list of monsters, [pull, commit and push]
        //  If character (strength + intelligence) > sum of monster (strength + intelligence) then you win.
        // 8 fight the monsters, [pull, commit and push]
        // 9 There is a very bad big boss monster. You need to train your Strength and Intelligence to defeat them.
        // For that define trainStrength method in Character.java
        // You also need trainIntelligence method in Character.java, however this is done by your teammate.
        // [pull, commit and push]
        // 10 Fight and win! Print out that you won. [pull, commit and push]


        Character playerOne = new Character("Greeteke");

        Weapon weapon = new Weapon("Pulgakomm", 1);
        playerOne.setWeapon(weapon);

        ArrayList<Monster> monsters = new ArrayList<>();

        Monster kits = new Monster("Kits");
        Monster lammas = new Monster("Lammas");
        Monster tiiger = new Monster("Tiiger");

        monsters.add(kits);
        monsters.add(lammas);
        monsters.add(tiiger);

        kits.setStrength(222);
        lammas.setStrength(222);
        tiiger.setStrength(222);

    }

}
