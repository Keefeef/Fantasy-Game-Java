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
    Knight knight;
    Dwarves dwarf;



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
        knight = new Knight(20,10,3,5);
        barbarian = new Barbarian(20, 10, 3);
        dwarf = new Dwarves(15, 10, 5);
        game = new Game(rooms, barbarian, warlock, cleric);
    }


    @Test
    public void cangetRoomCount(){
        assertEquals(5, game.getTotalRoomCount());
    }

    @Test
    public void canWinGame(){
        barbarian.attackEnemy(enemyRoom1);
        barbarian.clearEnemyRoom(enemyRoom1);
        barbarian.getPoints(treasureRoom1);
        barbarian.attackEnemy(enemyRoom2);
        barbarian.clearEnemyRoom(enemyRoom2);
        barbarian.getPoints(treasureRoom2);
        barbarian.getPoints(treasureRoom3);
        assertEquals(true, game.winGame(barbarian, enemyRoom1, treasureRoom1));
    }

    @Test
    public void knightCanWinGame(){
        knight.attackEnemy(enemyRoom1);
        knight.clearEnemyRoom(enemyRoom1);
        knight.getPoints(treasureRoom1);
        knight.attackEnemy(enemyRoom2);
        knight.clearEnemyRoom(enemyRoom2);
        knight.getPoints(treasureRoom2);
        knight.getPoints(treasureRoom3);
        assertEquals(true, game.winGame(knight, enemyRoom1, treasureRoom1));
    }

    @Test
    public void dwarfCanWinGame(){
        dwarf.attackEnemy(enemyRoom1);
        dwarf.clearEnemyRoom(enemyRoom1);
        dwarf.getPoints(treasureRoom1);
        dwarf.attackEnemy(enemyRoom2);
        dwarf.clearEnemyRoom(enemyRoom2);
        dwarf.getPoints(treasureRoom2);
        dwarf.getPoints(treasureRoom3);
        assertEquals(true, game.winGame(dwarf, enemyRoom1, treasureRoom1));
    }

    @Test
    public void canGetCompletedRoomCount(){
        barbarian.attackEnemy(enemyRoom1);
        barbarian.clearEnemyRoom(enemyRoom1);
        barbarian.getPoints(treasureRoom1);
        barbarian.attackEnemy(enemyRoom2);
        barbarian.clearEnemyRoom(enemyRoom2);
        barbarian.getPoints(treasureRoom2);
        barbarian.getPoints(treasureRoom3);
        assertEquals(5, game.getCompletedRoomCount(barbarian, enemyRoom1, treasureRoom1));
    }
}
