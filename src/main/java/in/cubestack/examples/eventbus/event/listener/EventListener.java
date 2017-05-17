package in.cubestack.examples.eventbus.event.listener;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by init5_0 on 5/18/2017.
 */
public abstract class EventListener {

    @Autowired
    private EventManager eventManager;

    @PostConstruct
    private void init() {
        eventManager.register(this);
        System.out.println(String.format("Registered: %s", this.getClass().getCanonicalName()));
    }
}
