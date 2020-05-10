import org.junit.jupiter.api.Test;
import some.domain.to.demonstrate.how.important.MyUtilsClass;

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

    @Test
    public void testAnotherUtil() {
        new MyUtilsClass().testNothing();
    }

}
