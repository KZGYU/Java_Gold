package Chapter8_1;

public class TestFoo {
	public static void main(String[] args) {
		Foo fooInstance = Foo.getFoo();
		fooInstance.increase(10);
		System.out.println(fooInstance.getNum()); // 10を出力
		fooInstance.decrease(5);
		System.out.println(fooInstance.getNum()); // 5を出力
	}
}
