package in.cubestack.examples.eventbus.event.listener;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import in.cubestack.examples.eventbus.event.Event;
import org.springframework.stereotype.Component;

/**
 * Created by init5_0 on 5/18/2017.
 */
@Component
public class EventLogListener extends EventListener {

    @AllowConcurrentEvents
    @Subscribe
    public void onAnyEvent(Event event) {
        System.out.println(String.format("Logging:  %s ", event));
    }
}
