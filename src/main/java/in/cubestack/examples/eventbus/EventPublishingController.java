package in.cubestack.examples.eventbus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by init5_0 on 5/18/2017.
 */
@RestController
public class EventPublishingController {

    @Autowired
    EventManager eventManager;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String publish() {
        eventManager.post(new OrderEvent("ORDER", "One Plus 3T"));
        eventManager.post(new WishListEvent("WISHLIST", "LG 43' LED Full Screen TV"));
        eventManager.post(new NotHandledEvent("NOT_HANDLED", "No handler is there for me. Sad :("));
        return "PUBLISHED ALL EVENTS";
    }
}
