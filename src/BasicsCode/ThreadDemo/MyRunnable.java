package BasicsCode.ThreadDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/1
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("MyRunnable run");
    }
}
