import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

/**
 * Created by Anna on 17/02/27.
 */
@AllArgsConstructor
@Getter
public class Destination {
    private String name;
    private Destination previousDestination;

    public Destination(String name) {
        this.name = name;
    }

    public String root() throws NullPointerException{
        if(name == null) {
            throw new NullPointerException();
        } if(previousDestination == null) {
            return name;
        } else {
            return previousDestination.root();
        }
    }

    public void getRoute(ArrayList<String> routeWithDuplicates) throws NullPointerException{
        if(name == null) {
            throw new NullPointerException();
        } else if(previousDestination == null) {
            routeWithDuplicates.add(name);
        } else {
            previousDestination.getRoute(routeWithDuplicates);
            routeWithDuplicates.add(previousDestination.getName());
        }
    }
}
