package Chapter6_10;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {
	public static void main(String[] args) {
		double result = DoubleStream.of(10.0, 20.0, 30.0, 35.0, 45.0, 50.0).mapToInt(x -> (int) x).boxed()
				.collect(Collectors.averagingInt(x -> x));

		System.out.println(result);
	}
}
