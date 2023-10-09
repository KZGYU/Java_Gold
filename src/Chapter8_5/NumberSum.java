package Chapter8_5;

import java.util.Arrays;


public class NumberSum {
    public static void main(String[] args) {
    	//Arrays.asList("100", "200", "300")を使用して、文字列のリストを生成しています。
        int num = Arrays.asList("100", "200", "300")
        		
        	         	//このリストをパラレルストリームに変換します。
            	       // ListのparallelメソッドをparallelStreamに変更
                        .parallelStream()  
                        
                        //リスト内のすべての数字を足し合わせて、その合計をnum変数に代入します。
                        .map(Integer::parseInt)
                        
                        //計算された合計を出力します
                        .reduce(0, (s1, s2) -> s1 + s2);
        
        System.out.println(num);
    }
}
