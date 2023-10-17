package Chapter9_PT_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Foo  implements Serializable{
    int a;

    Foo() {
        a = 10;
        System.out.println("Foo()");
    }
}

class Bar extends Foo  {
    int b;

    Bar() {
        super();  // 明示的に親クラスのコンストラクタを呼び出す（この呼び出しは実際には省略可能です）
        b = 10;
        System.out.println("Bar()");
    }
}

public class Main {
    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.a = 100;
        bar.b = 100;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Java/data.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Java/data.txt"))) {

            oos.writeObject(bar);  // シリアライズ

            Bar readBar = (Bar) ois.readObject();  // デシリアライズ
            System.out.println("readBar.a : " + readBar.a);
            System.out.println("readBar.b : " + readBar.b);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
