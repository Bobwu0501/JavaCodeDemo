package BasicsCode.ThreadpoolDemo.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 描述：
 * 线程池构造工厂
 *
 * @author wushunyu
 * @date 2020/4/22
 */
public class ExecutorServiceFactory {

    private static ExecutorServiceFactory executorServiceFactory = new ExecutorServiceFactory();

    /**
     * 定时任务线程池
     */
    private ExecutorService executors;

    private ExecutorServiceFactory() {

    }

    /**
     * 获取executorServiceFactory
     *
     * @return
     */
    public static ExecutorServiceFactory getInstance() {
        return executorServiceFactory;
    }


    public ExecutorService createScheduledThreadPool() {

        //CPU数目
        int availableProcessors = Runtime.getRuntime().availableProcessors();

//        Executors.newScheduledThreadPool(availableProcessors * 10, get)
        return null;
    }


    /**
     * 获取线程工厂
     *
     * @return
     */
    private ThreadFactory getThreadFactory() {
        ThreadFactory threadFactory = new ThreadFactory() {
            AtomicInteger sn = new AtomicInteger();

            @Override
            public Thread newThread(Runnable r) {
                SecurityManager s = System.getSecurityManager();

                return null;
            }
        };
        return threadFactory;
    }


}
