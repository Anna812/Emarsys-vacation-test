/**
 * Created by Anna on 17/02/27.
 */
public class Destination {
    private String name;
    private Destination previousDestination;

    public Destination(String name) {
        this.name = name;
    }

    public Destination(String name, Destination previousDestination) {
        this.name = name;
        this.previousDestination = previousDestination;
    }

    public String getName() {
        return name;
    }

    public Destination getPreviousDestination() {
        return previousDestination;
    }

    public String route() {
        if(previousDestination == null) {
            return name;
        } else {
            return previousDestination.route();
        }
    }
}
