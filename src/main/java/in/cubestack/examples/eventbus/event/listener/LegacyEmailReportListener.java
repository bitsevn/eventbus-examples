package in.cubestack.examples.eventbus.event.listener;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import in.cubestack.examples.eventbus.event.*;

/**
 * Created by init5_0 on 5/18/2017.
 */
public class LegacyEmailReportListener extends EventListener {

    @AllowConcurrentEvents
    @Subscribe
    public void onManualEmailReportTriggerEvent(ManualEmailReportTriggerEvent event) {

    }

    @AllowConcurrentEvents
    @Subscribe
    public void onLoaderEODCompletionEvent(LoaderEODCompletionEvent event) {

    }

    @AllowConcurrentEvents
    @Subscribe
    public void onLoaderIntradayCompletionEvent(LoaderIntradayCompletionEvent event) {

    }

    @AllowConcurrentEvents
    @Subscribe
    public void onBenchmarkReloadEvent(BenchmarkReloadEvent event) {

    }

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
}
