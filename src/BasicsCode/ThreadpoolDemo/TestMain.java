package BasicsCode.ThreadpoolDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/22
 */
public class TestMain {

    private static int produceTaskSleepTime = 2000;
    private static int produceTaskMaxNumber = 10;


    public static void main(String[] args) throws InterruptedException {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (2, 4, 3, TimeUnit.SECONDS,
                        new ArrayBlockingQueue<Runnable>(3), new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 1; i <= produceTaskMaxNumber; i++) {
            String task = "task@ " + i;
            System.out.println("put " + task);
            threadPoolExecutor.execute(new ThreadPoolTask(task));
        }
    }
}
