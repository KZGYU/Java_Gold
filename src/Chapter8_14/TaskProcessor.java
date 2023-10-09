package Chapter8_14;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class TaskProcessor {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            List<Future<?>> list = new ArrayList<>();
            IntStream.range(0, 10)
                     .forEach(i -> list.add(service.submit(() -> foo(i))));
            list.stream().forEach(f -> show(f));
        } finally {
            service.shutdown();
        }
    }

    static Integer foo(int num) {
        // ここで適切な処理や値の計算を行う
        //eturn num;
        
        
        // 時間のかかる処理を模倣するN
         try {
             Thread.sleep(1000);  // 1秒待機
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         return num;
        
    }

    static void show(Future<?> f) {
        try {
            System.out.print(f.get() + " ");
        } catch (Exception e) {
            System.out.print("error ");
        }
    }
}
