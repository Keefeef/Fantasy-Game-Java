import Player.Barbarian;
import Room.EnemyRoom;
import Room.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBarbarian {

    Barbarian barbarian;
    EnemyRoom enemyRoom;
    TreasureRoom treasureRoom;

    @Before
    public void before(){
        barbarian = new Barbarian(20, 10, 3);
        enemyRoom = new EnemyRoom(10, 10);
        treasureRoom = new TreasureRoom(10);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(20, barbarian.getHealthPoints());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(10, barbarian.getWeapon());
    }

//    @Test
//    public void canGetTotalPower(){
//        assertEquals( 30, barbarian.getTotalPower());
//    }
//
//    @Test
//    public void canFight(){
//        assertEquals(true, barbarian.fight(enemyRoom));
//        assertEquals(10, barbarian.getTotalPower());
//    }
//
    @Test
    public void canTakeTreasure(){
        barbarian.getPoints(treasureRoom);
        assertEquals(40, barbarian.getTotalPower());
    }

    @Test
    public void canClearRoom(){
        barbarian.attackEnemy(enemyRoom);
        assertEquals(true, barbarian.clearEnemyRoom(enemyRoom));
    }

}
