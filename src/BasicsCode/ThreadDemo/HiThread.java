package BasicsCode.ThreadDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/1
 */
public class HiThread extends Thread{
    //volatile关键字解决了共享变量在线程间的可见性问题。
    public volatile boolean running = true;

    @Override
    public void run() {
        int n= 0;
        while (running){
            n++;
            System.out.println(n + " hello!");
        }
        System.out.println("end!");
    }
}