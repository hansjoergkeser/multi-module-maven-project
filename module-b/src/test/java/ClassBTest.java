import org.junit.jupiter.api.Test;
import some.domain.to.demonstrate.how.important.MyUtilsClass;

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

    @Test
    public void testAnotherUtil() {
        new MyUtilsClass().testNothing();
    }

}
