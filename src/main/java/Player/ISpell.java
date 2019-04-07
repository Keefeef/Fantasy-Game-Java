package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public interface ISpell {

    public int castSpell(EnemyRoom enemyRoom);
    public boolean clearEnemyRoom(EnemyRoom enemyRoom);
    public boolean getPoints(TreasureRoom treasureRoom);
    public int getSpell();
    public void setSpell(int spell);
    public int getPetHP();
    public void setPetName(String petName);

}
