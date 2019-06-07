import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryPatternTest {

    @Test
    public void testingFactoryPatternClassForGettingRightTypeOrNot() {
        FactoryPattern factoryPattern1 = new FactoryPattern(0);
        assertTrue(factoryPattern1.getVehicle() instanceof Maruti);
        FactoryPattern factoryPattern2 = new FactoryPattern(1);
        assertTrue(factoryPattern2.getVehicle() instanceof Audi);
        FactoryPattern factoryPattern3 = new FactoryPattern(2);
        assertTrue(factoryPattern3.getVehicle() instanceof Honda);
        FactoryPattern factoryPattern4 = new FactoryPattern(4);
        assertNull(factoryPattern4.getVehicle());

    }

}