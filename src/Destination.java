import lombok.AllArgsConstructor;
import lombok.Getter;
import sun.security.krb5.internal.crypto.Des;

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

    public String route() throws NullPointerException{
        if(name == null) {
            throw new NullPointerException();
        } else if(previousDestination == null) {
            return name;
        } else {
            previousDestination.route();
            return previousDestination.getName();
        }
    }

    public void getRoot(ArrayList<String> route) throws NullPointerException{
        if(name == null) {
            throw new NullPointerException();
        } else if(previousDestination == null) {
            route.add(name);
        } else {
            previousDestination.getRoot(route);
            route.add(previousDestination.getName());
        }
    }
}
