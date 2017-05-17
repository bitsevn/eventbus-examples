package in.cubestack.examples.eventbus;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by init5_0 on 5/18/2017.
 */
@Component
public class UserEventListener extends EventListener {

    @Autowired
    EventManager eventManager;

    @PostConstruct
    public void init() {
        eventManager.register(this);
    }

    @AllowConcurrentEvents
    @Subscribe
    public void onOrderEvent(OrderEvent event) {
        System.out.println(String.format("Handling %s ", event));
    }

    @AllowConcurrentEvents
    @Subscribe
    public void onWishListEvent(WishListEvent event) {
        System.out.println(String.format("Handling %s ", event));
    }

}
