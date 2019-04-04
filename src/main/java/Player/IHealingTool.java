package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public interface IHealingTool {

    public boolean heal(EnemyRoom enemyRoom);
    public boolean getPoints(TreasureRoom treasureRoom);
}
