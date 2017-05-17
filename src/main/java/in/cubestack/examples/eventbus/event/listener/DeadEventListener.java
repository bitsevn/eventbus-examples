package in.cubestack.examples.eventbus.event.listener;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by init5_0 on 5/18/2017.
 */
@Component
public class DeadEventListener extends EventListener {

    @AllowConcurrentEvents
    @Subscribe
    public void onDeadEvent(DeadEvent event) {
        System.out.println(String.format("Handling dead event(no event handler registered for this):  %s ", event));
    }
}
