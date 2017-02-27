import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Anna on 17/02/27.
 */
public class DestinationTest {

    @Test
    public void testRootWithOneDestination() throws Exception {
        Destination x = new Destination("x");
        assertEquals("x", x.root());
    }

    @Test(expected = NullPointerException.class)
    public void testRooteWithNullArg() throws Exception {
        Destination y = null;
        y.root();
    }

    @Test(expected = NullPointerException.class)
    public void testRootWithNullName() throws Exception {
        Destination z = new Destination(null);
        z.root();
    }

    @Test
    public void testRootWithDependency() throws Exception {
        Destination x = new Destination("x");
        Destination z = new Destination("z", x);
        Destination y = new Destination("y", z);
        assertEquals("x", y.root());
    }
}
