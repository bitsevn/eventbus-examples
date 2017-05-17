package in.cubestack.examples.eventbus.event;

/**
 * Created by init5_0 on 5/18/2017.
 */
public class RDSSignoffEvent extends Event<String> {

    public RDSSignoffEvent(String name, String payload) {
        super(name, payload);
    }
}
