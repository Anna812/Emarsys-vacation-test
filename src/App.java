import java.util.ArrayList;

/**
 * Created by Anna on 17/02/27.
 */
public class App {
    public static void main(String[] args) {

    }

    public static ArrayList<String> createRoute(ArrayList<Destination> destinations) throws Exception {
        ArrayList<String> routeWithDuplicates = new ArrayList<>();

        for (Destination temp : destinations) {
            if(temp.getPreviousDestination() != null) {
                temp.getRoot(routeWithDuplicates);
            }
            routeWithDuplicates.add(temp.getName());
        }
        return deleteDuplicates(routeWithDuplicates);
    }

    public static ArrayList<String> deleteDuplicates(ArrayList<String> routeWithDuplicates) {
        ArrayList<String> optimalRoute = new ArrayList<>();
        for (String temp : routeWithDuplicates) {
            if(!optimalRoute.contains(temp)) {
                optimalRoute.add(temp);
            }
        }
        return optimalRoute;
    }
}
