package Chapter5_10;

import java.util.function.ToDoubleFunction;

public class Test {
    public static void main(String[] args) {
        ToDoubleFunction<Integer> f = i -> i * 0.1;
        System.out.println(f.applyAsDouble(100));
    }
}

