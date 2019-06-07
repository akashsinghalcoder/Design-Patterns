import org.junit.Test;

import static org.junit.Assert.*;

public class MarutiTest {
    @Test
    public  void testForPrintMethod() {
        Maruti maruti = new Maruti();
        assertEquals("maruti", maruti.printTheTypeOfCar());
    }

}