import Player.Player;
import Room.*;
import Player.*;

import java.util.ArrayList;

public class Game {

    private ArrayList<Room> rooms;
    private IWeapon iweapon;
    private ISpell ispell;
    private IHealingTool iHealingToll;
    private int completedRoom;

    public Game(ArrayList<Room> rooms, IWeapon iWeapon, ISpell ispell, IHealingTool iHealingToll){
        this.rooms = rooms;
        this.iweapon = iWeapon;
        this.ispell = ispell;
        this.iHealingToll = iHealingToll;
        this.completedRoom = 0;
    }

    public int getTotalRoomCount(){
        return this.rooms.size();
    }

    public boolean winGame(IWeapon player, EnemyRoom enemyRoom, TreasureRoom treasureRoom){
      if(this.getTotalRoomCount() == this.getCompletedRoomCount(player, enemyRoom, treasureRoom)){
          return true;
      }return false;
    }

    public int getCompletedRoomCount(IWeapon player, EnemyRoom enemyRoom, TreasureRoom treasureRoom){
        for (Room room : this.rooms){
            if(player.clearEnemyRoom(enemyRoom) == true || player.getPoints(treasureRoom)){
                this.completedRoom += 1;
            }

        }
        return this.completedRoom;
    }

}
