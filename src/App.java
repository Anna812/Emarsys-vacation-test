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
                route.add(temp.getName());
            } else {
                route.add(temp.getName());
            }
        }
        return deleteDuplicates(route);
    }

    public static ArrayList<String> deleteDuplicates(ArrayList<String> destinations) {
        ArrayList<String> result = new ArrayList<>();
        for (String temp : destinations) {
            if(!result.contains(temp)) {
                result.add(temp);
            }
        }
        return result;
    }
}
