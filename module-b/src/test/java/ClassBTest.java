import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClassBTest {

    @Test
    public void testSomethingInB() {
        assertTrue(true);
    }

    @Test
    public void testBWithTestResultOfCModule() {
        assertTrue(CClassCommonUtil.getTestResult());
    }

}
