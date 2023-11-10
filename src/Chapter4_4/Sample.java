package Chapter4_4;

import java.util.LinkedList;
//import java.util.List;
import java.util.Queue;

public class Sample {
	public static void main(String[] args) {
//		List<Integer> list = new LinkedList<Integer>();
		Queue<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.add(200);
		list.remove(1); // 1番目の要素ではなく、値が1のオブジェクトを削除する
		System.out.println(list);

		
	}

}
