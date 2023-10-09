package Chapter8_4;

import java.util.stream.IntStream;

public class Counter {
	   public static void main(String[] args) {
	        int num = 0;
	        IntStream.iterate(1, i -> 1)
	                 .limit(100)
	                 .parallel()
	                 .forEach(i -> ++num);
	        System.out.println(num);
	    }

}
