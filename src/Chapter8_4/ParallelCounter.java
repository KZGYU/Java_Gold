package Chapter8_4;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ParallelCounter {
    public static void main(String[] args) {
        AtomicInteger num = new AtomicInteger(0);
        IntStream.iterate(1, i -> 1)
                 .limit(100)
                 .parallel()
                 .forEach(i -> num.incrementAndGet());
        System.out.println(num.get());
    }
}
