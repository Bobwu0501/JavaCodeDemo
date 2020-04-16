package BasicsCode.ThreadpoolDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/14
 */
public class MyTask implements Runnable {

    private int taskNum;

    public MyTask(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public void run() {
        System.out.println("正在执行task: " + taskNum + " 当前线程号 ： "+ Thread.currentThread().getName());
//        System.out.println("当前线程号 ： " + Thread.currentThread().getName());
        try {
            Thread.currentThread().sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("task: " + taskNum + "执行完毕");
    }
}
