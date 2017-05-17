package in.cubestack.examples.eventbus.event.listener;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import in.cubestack.examples.eventbus.event.RDSSignoffEvent;

/**
 * Created by init5_0 on 5/18/2017.
 */
public class CheckbatchReportListener extends EventListener {

    @AllowConcurrentEvents
    @Subscribe
    public void onRDSSignoffEvent(RDSSignoffEvent event) {

    }
}
