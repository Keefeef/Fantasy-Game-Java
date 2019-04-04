package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public class Warlock extends Player implements ISpell {
    private int spell;
    private int totalPower;

    public Warlock(int healthPoints, int spell){
        super(healthPoints);
        this.spell = spell;
    }
    public boolean castSpell(EnemyRoom enemyRoom){
        return true;
    }
    public boolean getPoints(TreasureRoom treasureRoom){
        return true;
    }
}
