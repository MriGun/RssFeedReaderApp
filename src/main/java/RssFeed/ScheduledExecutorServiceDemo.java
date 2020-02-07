package RssFeed;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import RssFeed.ReadRssFeed;
import RssFeed.WriteRssFeed;

public class ScheduledExecutorServiceDemo {

	public static void main(String[] args) {
		
		ScheduledExecutorService exec = Executors.newScheduledThreadPool(2);
		exec.scheduleWithFixedDelay(new WriteRssFeed(), 0, 5, TimeUnit.SECONDS);
		exec.scheduleWithFixedDelay(new ReadRssFeed(), 0, 8, TimeUnit.SECONDS);

	}

}
