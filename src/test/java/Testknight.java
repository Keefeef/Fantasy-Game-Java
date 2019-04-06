import Player.Knight;
import Room.EnemyRoom;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Testknight {

    Knight knight;
    EnemyRoom enemyRoom;

    @Before
    public void before(){
        knight = new Knight(10, 10, 10, 10);
        enemyRoom = new EnemyRoom(15, 5);
    }
    @Test
    public void canUseArmour(){
        assertEquals(5, knight.enemyAttack(enemyRoom));
    }
}
