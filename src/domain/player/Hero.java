package domain.player;

import entity.FantasyCharacter;

public class Hero extends FantasyCharacter {

    public Hero(String name, int healthPoints, int strength, int dexterity, int xp, int gold) {
        super(name, healthPoints, strength, dexterity, xp, gold);
    }
}
