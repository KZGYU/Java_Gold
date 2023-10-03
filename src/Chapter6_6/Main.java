package Chapter6_6;

import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		
//		var stream = Stream.iterate("1", n -> n + "1");
//		System.out.println(stream.limit(5).filter(s -> s.length() < 3));
//	}

		
		
//		下記コードは修正の主なポイントは、
//		Stream.iterateの第二引数であるラムダ式の中で文字列を連結する部分を n -> n + "1" と修正しました。
//		また、System.out.printlnの中でforEachを使って結果を出力しています。
//		これにより、コンパイルおよび実行が正しく行えるようになります。
		var stream = Stream.iterate("1", n -> n + "1");
		stream.limit(5).filter(s -> s.length() < 3).forEach(System.out::println);
	}
}
