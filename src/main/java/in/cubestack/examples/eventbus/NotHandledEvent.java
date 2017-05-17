package in.cubestack.examples.eventbus;

/**
 * Created by init5_0 on 5/18/2017.
 */
public class NotHandledEvent extends Event<String> {

    public NotHandledEvent(String name, String payload) {
        super(name, payload);
    }
}
