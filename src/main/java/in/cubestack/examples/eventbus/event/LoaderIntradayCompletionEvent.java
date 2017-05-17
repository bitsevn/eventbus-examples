package in.cubestack.examples.eventbus.event;

/**
 * Created by init5_0 on 5/18/2017.
 */
public class LoaderIntradayCompletionEvent extends Event<String> {

    public LoaderIntradayCompletionEvent(String name, String payload) {
        super(name, payload);
    }
}
