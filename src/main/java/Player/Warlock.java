package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public class Warlock extends Player implements ISpell {
    private int spell;

    public Warlock(int healthPoints, int attack, int spell){
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
