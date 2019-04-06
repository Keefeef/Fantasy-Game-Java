import Player.Dwarves;
import Room.EnemyRoom;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDwarve {

    Dwarves dwarves;
    EnemyRoom enemyRoom;

    @Before
    public void before(){
        dwarves = new Dwarves(15, 10, 10);
        enemyRoom = new EnemyRoom(10, 5);
    }

    @Test
    public void takesHalfDamage(){
        dwarves.enemyAttack(enemyRoom);
        assertEquals(10, dwarves.getHealthPoints());
    }
}
