import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;


/**
 * Created by Anna on 17/02/27.
 */
public class AppTest {

    @Test
    public void testPrintRouteWithOneDestination() throws Exception {
        Destination x = new Destination("x");
        Destination y = new Destination("y");
        Destination z = new Destination("z");

        ArrayList<Destination> destinations = new ArrayList<>(Arrays.asList(x, y, z));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("x", "y", "z"));
        assertEquals(expected, App.createRoute(destinations));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateRouteWithNullArg() throws Exception {
        App.createRoute(null);
    }

    @Test
    public void testCreateRouteWithOneArg() throws Exception {
        Destination x = new Destination("x");
        ArrayList<Destination> destinations = new ArrayList<>(Arrays.asList(x));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("x"));
        assertEquals(expected, App.createRoute(destinations));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateRouteWithNullNameDestination() throws Exception {
        Destination x = null;
        ArrayList<Destination> destinations = new ArrayList<>(Arrays.asList(x));
        App.createRoute(destinations);
    }

    @Test
    public void testCreateRouteWithDependency() throws Exception {
        Destination x = new Destination("x");
        Destination z = new Destination("z");
        Destination y = new Destination("y", z);
        ArrayList<Destination> destinations = new ArrayList<>(Arrays.asList(x, y, z));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("x", "z", "y"));
        assertEquals(expected, App.createRoute(destinations));
    }
}
