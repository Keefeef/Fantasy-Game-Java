package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public class Knight extends Player implements IWeapon {
    private int weapon;
    private int totalPower;

    public Knight(int healthPoints, int weapon){
        super(healthPoints);
        this.weapon = weapon;
    }

    public int getWeapon(){
        return this.weapon;
    }

    public int getTotalPower(){
        int totalPower = this.healthPoints + this.weapon;
        return totalPower;
    }


    public void setWeapon(int weapon){
        this.weapon = weapon;
    }

    public boolean fight(EnemyRoom enemyRoom){
        if (getTotalPower() > enemyRoom.getTotalPower()){
            this.healthPoints -= enemyRoom.getTotalPower();
            return true;
        }return false;
    }
    public boolean getPoints(TreasureRoom treasureRoom){
        this.healthPoints += treasureRoom.getPoints();
        return true;
    }
}


