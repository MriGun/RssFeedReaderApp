package RssFeed;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import RssFeed.ReadRssFeed;
import RssFeed.WriteRssFeed;

public class ScheduledExecutorServiceDemo {

	public static void main(String[] args) {
		
		Object lock = new Object();
		ScheduledExecutorService exec = Executors.newScheduledThreadPool(2);
		exec.scheduleWithFixedDelay(new WriteRssFeed(lock), 0, 15, TimeUnit.SECONDS);
		exec.scheduleWithFixedDelay(new ReadRssFeed(lock), 0, 20, TimeUnit.SECONDS);

	}

}
