package Chapter5_5;

//1
import java.util.function.Predicate;

public class Foo { // 2
	int val; // 3

	public static void main(String[] args) { // 4
		Foo obj = new Foo(); // 5
		obj.val = 20; // 6
		method(obj, a -> a.val < 100); // 7
	} // 8

	static void method(Foo obj, Predicate<Foo> p) { // 9
		String ans = p.test(obj) ? "hello" : "bye"; // 10
		System.out.println(ans); // 11
	} // 12
} // 13
