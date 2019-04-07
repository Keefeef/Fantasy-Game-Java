package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public interface IHealingTool {

    public void heal(Player player);
    public boolean getPoints(TreasureRoom treasureRoom);
}
