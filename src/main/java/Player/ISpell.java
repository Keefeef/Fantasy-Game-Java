package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public interface ISpell {

    public boolean castSpellOnEnemy(EnemyRoom enemyRoom);
    public boolean getPoints(EnemyRoom enemyRoom);



}
