package Chapter5_10;

import java.util.function.ToDoubleFunction;

public class Test {
<<<<<<< HEAD
	public static void main(String[] args) {
		ToDoubleFunction<Double> f = i -> i * 0.1;
		
		System.out.println(f.applyAsDouble(100));
	}
}
=======
    public static void main(String[] args) {
        ToDoubleFunction<Integer> f = i -> i * 0.1;
        System.out.println(f.applyAsDouble(100));
    }
}

>>>>>>> 0a91632d5a8a0f1614a80af8d51a1c6f701e2d47
