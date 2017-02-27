import java.util.ArrayList;

/**
 * Created by Anna on 17/02/27.
 */
public class App {
    public static void main(String[] args) {

    }

    public static ArrayList<String> createRoute(ArrayList<Destination> destinations) throws Exception {
        ArrayList<String> route = new ArrayList<>();

        for (Destination temp : destinations) {
            if(temp.getPreviousDestination() != null) {
                route.add(temp.route());
            } else {
                route.add(temp.getName());
            }
        }
        return route;
    }
}
