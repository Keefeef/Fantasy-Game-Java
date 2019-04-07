package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public class Cleric extends Player implements IHealingTool {
    private int healingTool;

    public Cleric(int healthPoints, int attack, int healingTool){
        super(healthPoints, attack);
        this.healingTool = healingTool;
    }

    public int getHealingTool(){
        return this.healingTool;
    }

    public void setHealingTool(int healingTool){
        this.healingTool = healingTool;
    }


    public void heal(Player player){
        this.healingTool += player.healthPoints;
    }
    public boolean getPoints(TreasureRoom treasureRoom){
        this.healthPoints += treasureRoom.getPoints();
        return true;
    }
}
