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
}