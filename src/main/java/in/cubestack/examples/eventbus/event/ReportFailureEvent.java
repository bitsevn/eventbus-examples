package in.cubestack.examples.eventbus.event;

/**
 * Created by init5_0 on 5/18/2017.
 */
public class ReportFailureEvent extends Event<String> {

    public ReportFailureEvent(String name, String payload) {
        super(name, payload);
    }
}
