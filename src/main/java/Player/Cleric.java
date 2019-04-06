package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public class Cleric extends Player implements IHealingTool {

    public Cleric(int healthPoints, int attack){
        super(healthPoints, attack);
    }


    public boolean heal(EnemyRoom enemyRoom){
        return true;
    }
    public boolean getPoints(TreasureRoom treasureRoom){
        return true;
    }
}
