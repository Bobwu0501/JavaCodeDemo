package BasicsCode.ThreadDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/3
 */
public class MyRun implements Runnable{

    @Override
    public void run() {
        System.out.println("run "+ Thread.currentThread().getName());
        System.out.println("run");
    }
}
