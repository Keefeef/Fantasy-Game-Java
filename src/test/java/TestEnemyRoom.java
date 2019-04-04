
import Room.EnemyRoom;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestEnemyRoom {

    EnemyRoom enemyRoom;

    @Before
    public void before(){
        enemyRoom = new EnemyRoom(10, 10);
    }

    @Test
    public void getPoints(){
        assertEquals(10, enemyRoom.getPoints());
    }

    @Test
    public void getWeapon(){
        assertEquals(10, enemyRoom.getWeapon());
    }

    @Test
    public void getTotalPower(){
        assertEquals(20, enemyRoom.getTotalPower());
    }

}
