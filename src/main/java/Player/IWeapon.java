package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public interface IWeapon {

    public int attackEnemy(EnemyRoom enemyRoom);
    public boolean clearEnemyRoom(EnemyRoom enemyRoom);
    public boolean getPoints(TreasureRoom treasureRoom);

}
