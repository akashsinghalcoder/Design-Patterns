import org.junit.Test;

import static org.junit.Assert.*;

public class HondaTest {
    @Test
    public  void testForPrintMethod() {
        Honda honda = new Honda();
        assertEquals("honda", honda.printTheTypeOfCar());
    }

}