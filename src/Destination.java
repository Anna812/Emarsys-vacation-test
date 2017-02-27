import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by Anna on 17/02/27.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Destination {
    private String name;
    private Destination previousDestination;

    public Destination(String name) {
        this.name = name;
    }

    public String route() {
        if(previousDestination == null) {
            return name;
        } else {
            return previousDestination.route();
        }
    }
}
