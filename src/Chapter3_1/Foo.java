package Chapter3_1;

public class Foo implements AutoCloseable {
	public static void main(String[] args) {
		try (Foo obj = new Foo()) {
			System.out.println("X");
		} catch (Exception e) {

		}
	}

	public void close() throws Exception {
		throw new Exception("y");
	}

}
