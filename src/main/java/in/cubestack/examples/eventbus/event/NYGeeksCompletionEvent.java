package in.cubestack.examples.eventbus.event;

/**
 * Created by init5_0 on 5/18/2017.
 */
public class NYGeeksCompletionEvent extends Event<String> {

    public NYGeeksCompletionEvent(String name, String payload) {
        super(name, payload);
    }
}
