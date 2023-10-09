package Chapter8_1;

public class Foo {
	private int num;

	public int getNum() {
		return this.num;
	}

	public void increase(int val) {
		num += val;
	}

	public void decrease(int val) {
		synchronized (this) {
			num -= val;
		}
	}

	private Foo() {
	}

	private static Foo obj;

	public static synchronized Foo getFoo() {
		if (obj == null)
			obj = new Foo();
		return obj;
	}
}
