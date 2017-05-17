package in.cubestack.examples.eventbus.event.listener;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import in.cubestack.examples.eventbus.event.*;

/**
 * Created by init5_0 on 5/18/2017.
 */
public class QueuedReportListener extends EventListener {

    @AllowConcurrentEvents
    @Subscribe
    public void onASIAGreeksCompletionEvent(ASIAGreeksCompletionEvent event) {

    }

    @AllowConcurrentEvents
    @Subscribe
    public void onNYGeeksCompletionEvent(NYGeeksCompletionEvent event) {

    }

    @AllowConcurrentEvents
    @Subscribe
    public void onBenchmarkCompletionEvent(BenchmarkCompletionEvent event) {

    }

    @AllowConcurrentEvents
    @Subscribe
    public void onMarketCapCompletionEvent(MarketCapCompletionEvent event) {

    }

    @AllowConcurrentEvents
    @Subscribe
    public void onSchedulerEvent(SchedulerEvent event) {

    }
}
