package BasicsCode.ThreadDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/3
 */
public class MyStart extends Thread{

    @Override
    public void run() {
        System.out.println("start "+ Thread.currentThread().getName());
        System.out.println("start");
    }
}
