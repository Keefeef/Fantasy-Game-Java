package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public interface ISpell {

    public boolean castSpell(EnemyRoom enemyRoom);
    public boolean getPoints(TreasureRoom treasureRoom);
}
