package in.cubestack.examples.eventbus;

/**
 * Created by init5_0 on 5/18/2017.
 */
public class OrderEvent extends Event<String> {

    public OrderEvent(String name, String payload) {
        super(name, payload);
    }
}
