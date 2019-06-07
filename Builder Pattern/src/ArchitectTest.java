import org.junit.Test;

import static org.junit.Assert.*;

public class ArchitectTest {

    @Test
    public void testForReturnTypeOfHouseBuilder() {
        assertTrue(Architect.returnTypeOfHouseBuilder(0) instanceof ConcreteHouseBuilder);
        assertNull(Architect.returnTypeOfHouseBuilder(1));
    }

    @Test
    public void testForConstructHouse() {
        Architect architect = new Architect(Architect.returnTypeOfHouseBuilder(0));
        architect.constructHouse();
        Home home = architect.returnHome();
        assertEquals(home.getBasement(), "Basement");
        assertEquals(home.getFloor(), "Floor");
        assertEquals(home.getRoof(), "Roof");
        assertEquals(home.getWalls(), "Walls");


    }

}