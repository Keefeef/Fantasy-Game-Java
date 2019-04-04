package Room;

public abstract class Room {
    protected int points;

    public Room(int points){
        this.points = points;
    }

    public int points(){
        return this.points;
    }
}
