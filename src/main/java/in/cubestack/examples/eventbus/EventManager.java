package in.cubestack.examples.eventbus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

/**
 * Created by init5_0 on 5/18/2017.
 */
@Component
public class EventManager {

    private EventBus eventBus = new AsyncEventBus(Executors.newCachedThreadPool());

    public void register(Object listener) {
        System.out.println("Registering listener: " + listener.getClass().getCanonicalName());
        eventBus.register(listener);
        System.out.println("Registered listener: " + listener.getClass().getCanonicalName());
    }

    public void post(Object event) {
        System.out.println("Publishing event: " + event);
        eventBus.post(event);
        System.out.println("published event: " + event);
    }
}
