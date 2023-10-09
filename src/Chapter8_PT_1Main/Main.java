package Chapter8_PT_1Main;

public class Main {
    public static void main(String[] args) {
        // スレッドの作成
        Thread a = new ThreadA();
        Thread b = new ThreadB();
        
        // スレッドの実行開始
        a.start();
        b.start();
    }
}

// Runnableインタフェースの実装クラス
class ThreadA extends Thread{
    public void run() { // スレッドが実行する処理
        for (int i = 0; i < 5; i++) {
            System.out.print("A:" + i + " ");
        }
    }
}

// Runnableインタフェースの実装クラス
class ThreadB extends Thread {
    public void run() { // スレッドが実行する処理
        for (int i = 0; i < 5; i++) {
            System.out.print("B:" + i + " ");
        }
    }
}
