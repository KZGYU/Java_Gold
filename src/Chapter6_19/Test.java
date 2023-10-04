package Chapter6_19;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;


/*User クラスはユーザー情報を表現するためのクラスです。
name フィールドはユーザーの名前、point フィールドはユーザーの得点を表します。
コンストラクタで名前と得点を指定してユーザーオブジェクトを作成し、
getName と getPoint メソッドでそれぞれ名前と得点を取得できます。*/
class User {
	String name;
	double point;

	User(String name, double point) {
		this.name = name;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public double getPoint() {
		return point;
	}

}

public class Test {
	public static void main(String[] args) {
	      // ユーザーオブジェクトのリストを作成
        List<User> users = Arrays.asList(new User("tanaka", 10.0), new User("sato", 15.0));
        
        // BinaryOperatorを用意して、ラムダ式で加算を定義
        BinaryOperator<Double> ope = (a, b) -> a + b;

        // ユーザーオブジェクトの得点を2倍にしてから総和を計算
        double total = users.stream().map(u -> u.getPoint() * 2).reduce(0.0, ope);

        // 結果を出力
        System.out.println(total);

	}

}
