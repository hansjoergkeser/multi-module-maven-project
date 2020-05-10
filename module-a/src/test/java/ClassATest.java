import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ClassATest {

    @Test
    public void testSomethingInA() {
        assertTrue(true);
    }

    @Test
    public void testAWithTestResultOfCModule() {
        assertTrue(CClassCommonUtil.getTestResult());
    }

}
