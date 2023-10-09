package Chapter8_PT_4Main;

public class Main {
	public static void main(String[] args) {
		Thread threadA = new Thread(() -> {
			System.out.println("threadA : sleep 開始");
			try {
				Thread.sleep(5000); // ThreadA スレッド の sleep
			} catch (InterruptedException e) {
				System.out.println("threadA : 割り込み を キャッチ し まし た");
			}
			System.out.println("threadA : 処理 再開");
		});

		threadA.start();

		try {
			System.out.println("main : sleep 開始");
			Thread.sleep(2000); // main スレッド の sleep
			System.out.println("main : sleep 終了");
			threadA.interrupt(); // スレッド へ 割り込み
		} catch (InterruptedException e) {
			System.out.println("main : 割り込み を キャッチ し まし た");
		}
	}
}
