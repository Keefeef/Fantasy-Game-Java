package Player;

public abstract class Player {
    protected int healthPoints;
    protected int attack;


    public Player(int healthPoints, int attack){
        this.healthPoints = healthPoints;
        this.attack = this.attack;

    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public int getAttack(){
        return this.attack;
    }

    public static int getRandomValue(){
        int x = (int)(Math.random()*((5-2)+1))+2;
        return x;
    }







}
