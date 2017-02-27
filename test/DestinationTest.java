import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Anna on 17/02/27.
 */
public class DestinationTest {

    @Test
    public void testPrintRouteWithOneDestination() throws Exception {
        Destination x = new Destination("x");
        assertEquals("x", x.route());
    }

    @Test(expected = NullPointerException.class)
    public void testPrintRouteWithNullArg() throws Exception {
        Destination y = null;
        y.route();
    }

    @Test(expected = Exception.class)
    public void testPrintRouteWithNullName() throws Exception {
        Destination z = new Destination(null);
        z.route();
    }
}
