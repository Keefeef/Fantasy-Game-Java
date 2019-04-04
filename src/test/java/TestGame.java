import Player.Player;
import Room.Room;
import Room.EnemyRoom;
import Room.TreasureRoom;
import Player.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class TestGame {
    Game game;
    EnemyRoom enemyRoom1;
    EnemyRoom enemyRoom2;
    TreasureRoom treasureRoom1;
    TreasureRoom treasureRoom2;
    TreasureRoom treasureRoom3;
    Barbarian barbarian;
    Warlock warlock;
    Cleric cleric;



    @Before
    public void before(){
        enemyRoom1 = new EnemyRoom(5, 5);
        enemyRoom2 = new EnemyRoom(5, 10);
        treasureRoom1 =  new TreasureRoom(5);
        treasureRoom2 =  new TreasureRoom(5);
        treasureRoom3 =  new TreasureRoom(5);
        ArrayList<Room> rooms = new ArrayList();
        rooms.add(enemyRoom1);
        rooms.add(enemyRoom2);
        rooms.add(treasureRoom1);
        rooms.add(treasureRoom2);
        rooms.add(treasureRoom3);
        barbarian = new Barbarian(20, 10);
        game = new Game(rooms, barbarian, warlock, cleric);
    }


    @Test
    public void cangetRoomCount(){
        assertEquals(5, game.getTotalRoomCount());
    }

    @Test
    public void canWinGame(){
        barbarian.fight(enemyRoom1);
        barbarian.getPoints(treasureRoom1);
        barbarian.fight(enemyRoom2);
        barbarian.getPoints(treasureRoom2);
        barbarian.getPoints(treasureRoom3);
        assertEquals(true, game.winGame(barbarian, enemyRoom1, treasureRoom1));
    }

    @Test
    public void canGetCompletedRoomCount(){
        barbarian.fight(enemyRoom1);
        barbarian.getPoints(treasureRoom1);
        barbarian.fight(enemyRoom2);
        barbarian.getPoints(treasureRoom2);
        barbarian.getPoints(treasureRoom3);
        assertEquals(5, game.getCompletedRoomCount(barbarian, enemyRoom1, treasureRoom1));
    }
}
