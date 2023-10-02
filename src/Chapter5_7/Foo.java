package Chapter5_7;

interface Foo1 {
	boolean bar(double a, double b);
}

class Test {
	public static void main(String[] args) {
		method((x, y) -> x / y > 0, 3.0);
	}

	static void method(Foo1 obj, double d) {
		if (obj.bar(9.0, d))
			System.out.println("a");
		else
			System.out.println("b");
	}
}
