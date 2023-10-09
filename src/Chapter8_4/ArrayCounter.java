package Chapter8_4;

import java.util.stream.IntStream;

public class ArrayCounter {
    public static void main(String[] args) {
        int[] num = {0};
        IntStream.iterate(1, i -> 1)
                 .limit(100)
                 .parallel()
                 .forEach(i -> ++num[0]);
        System.out.println(num[0]);
    }
}
