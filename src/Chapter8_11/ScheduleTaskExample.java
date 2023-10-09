package Chapter8_11;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/*
newSingleThreadScheduledExecutor()メソッドは、ScheduledExecutorServiceタイプのオブジェクトを返しますので、
6行目のExecutorServiceをScheduledExecutorServiceに変更する必要があります。

9行目のCallableタスクは、戻り値を持たなければなりませんが、そのタスクは何も返していません。
しかし、scheduleWithFixedDelay()メソッドはRunnableタスクを期待しているので、9行目のCallableをRunnableに変更しましょう。
 */



public class ScheduleTaskExample {
	
    public static void main(String[] args) {
    	
    	//ExecutorServiceをScheduledExecutorServiceに変更
        ScheduledExecutorService service = null;
        
        try {
        	
            service = Executors.newSingleThreadScheduledExecutor();
            
            //CallableをRunnableに変更
            Runnable task = () -> System.out.println(new Date());
            
            service.scheduleWithFixedDelay(task, 1, 2, TimeUnit.SECONDS);
            
        } finally {
        	
            if (service != null) service.shutdown();
            
        }
        
        
    }
    
}
