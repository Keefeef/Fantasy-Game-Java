package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public class Knight extends Player implements IWeapon {
    private int weapon;
    private int armour;

    public Knight(int healthPoints, int attack, int weapon, int armour){
        super(healthPoints, attack);
        this.weapon = weapon;
        this.armour = armour;
    }

    public int getWeapon(){
        return this.weapon;
    }

    public int getArmour() {
        return armour;
    }

    public int getTotalVitality(){
        int totalVitality = this.healthPoints + this.armour;
        return totalVitality;
    }

    public int getTotalPower(){
        int power = this.healthPoints + this.weapon;
        int overallAttack = power + getRandomValue();
        return overallAttack;
    }


    public void setWeapon(int weapon){
        this.weapon = weapon;
    }

//    public boolean fight(EnemyRoom enemyRoom){
//        if (getTotalPower() > enemyRoom.getTotalPower()){
//            this.healthPoints -= enemyRoom.getTotalPower();
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

    public int enemyAttack(EnemyRoom enemyRoom){
        int vitality = getTotalVitality();
        int remainingVitality = vitality - enemyRoom.getPoints();
        return remainingVitality;
    }

    public boolean clearEnemyRoom(EnemyRoom enemyRoom){
        if (attackEnemy(enemyRoom) >= 0){
            return true;
        }return false;
    }
}


