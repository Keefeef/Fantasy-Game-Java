package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public class Barbarian extends Player implements IWeapon{
    private int weapon;

    public Barbarian(int healthPoints, int attack, int weapon){
        super(healthPoints, attack);
        this.weapon = weapon;
    }


    public int getWeapon(){
        return this.weapon;
    }



    public int getTotalPower(){
        int power = this.attack * this.weapon;
        int overallAttack = power + getRandomValue();
        return overallAttack;
    }


    public void setWeapon(int weapon){
         this.weapon = weapon;
    }

//    public boolean fight(EnemyRoom enemyRoom){
//        if (getTotalPower() > enemyRoom.getTotalPower()){
//           this.healthPoints -= enemyRoom.getTotalPower();
//            return true;
//        }return false;
//    }
    public boolean getPoints(TreasureRoom treasureRoom){
        this.healthPoints += treasureRoom.getPoints();
        return true;
    }

    public int attackEnemy(EnemyRoom enemyRoom){
        int totalPower = getTotalPower();
        int enemyHealth = enemyRoom.getPoints() - totalPower;
        return enemyHealth;
    }

    public void enemyAttack(EnemyRoom enemyRoom){
        this.healthPoints -= enemyRoom.getPoints();
    }

    public boolean clearEnemyRoom(EnemyRoom enemyRoom){
        if (attackEnemy(enemyRoom) >= 0){
            return true;
        }return false;
    }



}
