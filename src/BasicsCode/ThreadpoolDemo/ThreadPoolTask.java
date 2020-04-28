package BasicsCode.ThreadpoolDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/22
 */
public class ThreadPoolTask implements Runnable {

    private static final long serialVersionUID = 0;
    private static int consumeTaskSleepTime = 2000;

    private Object threadPoolTaskData;

    public ThreadPoolTask(Object threadPoolTaskData) {
        this.threadPoolTaskData = threadPoolTaskData;
    }

    @Override
    public void run() {
        System.out.println("start..." + Thread.currentThread().getName() + "  " + threadPoolTaskData);
        try {
            Thread.sleep(consumeTaskSleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end..." + Thread.currentThread().getName() + "  " + threadPoolTaskData);
        threadPoolTaskData = null;
    }

    public Object getThreadPoolTaskData() {
        return threadPoolTaskData;
    }
}
