package in.cubestack.examples.eventbus;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

/**
 * Created by init5_0 on 5/18/2017.
 */
public abstract class EventListener {

    @AllowConcurrentEvents
    @Subscribe
    public void onAllEvents(Event event) {
        System.out.println(String.format("Logged handling of %s ", event));
    }

    @AllowConcurrentEvents
    @Subscribe
    public void onDeadEvent(DeadEvent event) {
        System.out.println(String.format("Handling dead event(no event handler registered for this):  %s ", event));
    }
}
