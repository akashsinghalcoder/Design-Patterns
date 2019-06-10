import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonDBConnectionTest {
    @Test
    public void testingForSingletonObject() {
        SingletonDBConnection subject1 = SingletonDBConnection.getInstanceOfSingletonDBConnection();
        assertEquals(subject1.getVariableForTestingSingletonClass(), 0);
        subject1.setVariableForTestingSingletonClass(40);
        SingletonDBConnection subject2 = SingletonDBConnection.getInstanceOfSingletonDBConnection();
        assertEquals(subject2.getVariableForTestingSingletonClass(), 40);
         
        


    }

}