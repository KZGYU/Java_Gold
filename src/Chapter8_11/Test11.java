package Chapter8_11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Test11 {

	private static AtomicInteger val1 = new AtomicInteger();
	private static int val2 = 0;

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;

		try {
			service = Executors.newSingleThreadExecutor();
			for (int i = 0; i < 100; i++) {
				service.execute(() -> {
					val1.getAndIncrement();
					val2++;
				});
			}

			Thread.sleep(500);
			System.out.println(val1 + " " + val2);

		} finally {
			if (service != null) {
				service.shutdown();
			}
		}
	}
}
