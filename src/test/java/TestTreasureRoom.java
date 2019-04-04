import Room.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestTreasureRoom {
    TreasureRoom treasureRoom;

    @Before
    public void before(){
        treasureRoom = new TreasureRoom(10);
    }

    @Test
    public void getPoints(){
        assertEquals(10, treasureRoom.getPoints());
    }
}
