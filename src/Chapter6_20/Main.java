package Chapter6_20;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		
		/*IntStream.range(10, 15)で10から14までのint型のストリームが生成され、
		 * .mapToObj(i -> i)でそれをIntegerオブジェクトのストリームに変換しています。
		 * その後、.collect(Collectors.toList())でそのストリームをListに変換しています。*/
		List<Integer> list = IntStream.range(10,15)
				.mapToObj(i->i)
				.collect(Collectors.toList());
		list.forEach(System.out::print);
		
		/*上記コードと同等*/
		IntStream. range( 10, 15) .forEach( System. out:: print);
	}

}
