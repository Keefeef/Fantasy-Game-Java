package Room;

public class EnemyRoom extends Room{
    private int weapon;


    public EnemyRoom(int points, int weapon){
        super(points);
        this.weapon = weapon;
    }

    public int getPoints(){
        return this.points;
    }

    public int getWeapon(){
        return this.weapon;
    }

    public int getTotalPower(){
        int totalPower = this.points + this.weapon;
        return totalPower;
    }


}
