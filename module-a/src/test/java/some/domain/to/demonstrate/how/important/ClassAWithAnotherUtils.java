package some.domain.to.demonstrate.how.important;

import org.junit.jupiter.api.Test;

public class ClassAWithAnotherUtils {

    // does not work, MyUtilsClass can not be found
    @Test
    public void testAnotherUtil() {
        new MyUtilsClass().testNothing();
    }

}
