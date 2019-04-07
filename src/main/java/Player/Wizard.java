package Player;

import Room.EnemyRoom;
import Room.TreasureRoom;

public class Wizard extends Player implements ISpell {
    private int spell;
    private String petName;
    private int petHP;

    public Wizard(int healthPoints, int attack, int spell, String petName, int petHP){
        super(healthPoints, attack);
        this.spell = spell;
        this.petName = petName;
        this.petHP = petHP;
    }
    public void setSpell(int spell) {
        this.spell = spell;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetHP(int petHP) {
        this.petHP = petHP;
    }

    @Override
    public int getSpell() {
        return spell;
    }

    public String getPetName() {
        return petName;
    }

    @Override
    public int getPetHP() {
        return petHP;
    }

    public int totalMagicPower(){
        int power = this.attack * this.spell;
        int magicPower = power + getRandomValue();
        return magicPower;
    }

    public int castSpell(EnemyRoom enemyRoom){
        int magicPower = totalMagicPower();
        int enemyHealth = enemyRoom.getPoints() - magicPower;
        return enemyHealth;
    }

    public boolean getPoints(TreasureRoom treasureRoom){
        this.healthPoints += treasureRoom.getPoints();
        return true;
    }

    public boolean clearEnemyRoom(EnemyRoom enemyRoom){
        if (castSpell(enemyRoom) >= 0){
            return true;
        }return false;
    }

    public int enemyAttackPet(EnemyRoom enemyRoom){
        int remainingPetHP = this.petHP -= enemyRoom.getPoints();
        return  remainingPetHP;
    }

    public void enemyAttackMagicUser(EnemyRoom enemyRoom){
        if (enemyAttackPet(enemyRoom) >= 0){
            this.healthPoints -= enemyRoom.getPoints();
        }
    }

}


