package Chapter6_14;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    	
    	// *  Stream.iterate(1, i -> ++i)：1から始めて、無限に次の整数を生成します。
        String result = Stream.iterate(1, i -> ++i)
                              .limit(5)//    .limit(5)：最初の5つの整数のみを取得します。
                              .map(i -> "" + i)//    .map(i -> "" + i)：各整数を文字列に変換します。
                              .collect(Collectors.joining());//    .collect(Collectors.joining())：文字列のストリームを1つの文字列に結合します。

        System.out.println(result); // 出力: 12345    System.out.println(result)：結果として得られる文字列を出力します。
    }
}
