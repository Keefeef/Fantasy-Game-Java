package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public class Cleric extends Player implements IHealingTool {

    public Cleric(int healthPoints){
        super(healthPoints);
    }


    public boolean heal(EnemyRoom enemyRoom){
        return true;
    }
    public boolean getPoints(TreasureRoom treasureRoom){
        return true;
    }
}
