import org.junit.Test;

import static org.junit.Assert.*;

public class AudiTest {
    @Test
    public  void testForPrintMethod() {
        Audi audii = new Audi();
        assertEquals("audi", audii.printTheTypeOfCar());
    }

}