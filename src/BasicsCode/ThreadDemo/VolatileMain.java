package BasicsCode.ThreadDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/1
 */
public class VolatileMain {

    //volatile关键字的目的是告诉虚拟机：
    //   每次访问变量时，总是获取主内存的最新值；
    //   每次修改变量后，立刻回写到主内存。

    public static void main(String[] args) throws InterruptedException {

        HiThread t = new HiThread();
        t.start();
        Thread.sleep(1);
        t.running = false;
        System.out.println("main end");
    }

}
