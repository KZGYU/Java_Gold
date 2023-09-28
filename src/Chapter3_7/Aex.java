package Chapter3_7;

class Aex extends RuntimeException {
	
	Aex() {
		System.out.println("A");
		
	}
	
	public Aex(String msg) {
		super(msg);
	}

	public Aex(int code) {
		// more code
	}

}

class Bex extends Aex {
	public Bex() {
		// more code
	}

	public Bex(String msg) {
		super(msg);
	}
}
