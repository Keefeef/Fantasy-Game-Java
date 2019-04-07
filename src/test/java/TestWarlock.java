import Player.Warlock;
import Room.EnemyRoom;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestWarlock {

    Warlock warlock;
    EnemyRoom enemyRoom;

    @Before
    public void before(){
        warlock = new Warlock(15, 5, 10, "James", 5, 5);
        enemyRoom = new EnemyRoom(10, 5);
    }

    @Test
    public void canKillPet(){
        warlock.enemyAttackPet(enemyRoom);
        warlock.enemyAttackMagicUser(enemyRoom);
        assertEquals(5,warlock.getHealthPoints());
    }
}
