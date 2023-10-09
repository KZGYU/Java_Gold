package Chapter8_16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class ExecutorExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		try {
			List<Future<Object>> list = new ArrayList<>();

			// Stream.iterateを使用してnullを3回繰り返すストリームを生成
			Stream.iterate(null, i -> i).limit(3).forEach(i -> list.add(service.submit(() -> i))); // 各nullをFutureにラップ

			for (Future<?> data : list) {

				System.out.print(data.get() + "");

			}

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
