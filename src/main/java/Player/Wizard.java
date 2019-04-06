package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public class Wizard extends Player implements ISpell {
    private int spell;

    public Wizard(int healthPoints, int attack, int spell){
        super(healthPoints, attack);
        this.spell = spell;
    }
    public boolean castSpell(EnemyRoom enemyRoom){
        return true;
    }
    public boolean getPoints(TreasureRoom treasureRoom){
        return true;
    }
}

