package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public interface IWeapon {

    public boolean fight(EnemyRoom enemyRoom);
    public boolean getPoints(TreasureRoom treasureRoom);
}
