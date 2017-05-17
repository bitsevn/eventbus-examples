package in.cubestack.examples.eventbus.event.listener;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import in.cubestack.examples.eventbus.event.BenchmarkReloadEvent;
import in.cubestack.examples.eventbus.event.LoaderEODCompletionEvent;
import in.cubestack.examples.eventbus.event.LoaderIntradayCompletionEvent;

/**
 * Created by init5_0 on 5/18/2017.
 */
public class EODReportListener extends EventListener {

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
}
