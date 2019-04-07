import Player.Barbarian;
import Player.Cleric;
import Player.Player;
import Player.Warlock;
import org.junit.Before;
import org.junit.Test;

import static com.sun.tools.doclets.formats.html.markup.HtmlStyle.bar;
import static junit.framework.TestCase.assertEquals;

public class TestCleric {
    Cleric cleric;
    Barbarian barbarian;
    Warlock warlock;
    Player player;

    @Before
    public void before(){
        cleric = new Cleric(10, 10, 10);
        barbarian = new Barbarian(10, 10, 10);
        warlock = new Warlock(10, 10, 10, "Bob", 10, 2);

    }
    @Test
    public void canHealWarrior(){
        cleric.heal(barbarian);
        assertEquals(20, barbarian.getHealthPoints());
    }
}
