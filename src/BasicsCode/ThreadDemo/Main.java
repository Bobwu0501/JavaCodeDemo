package BasicsCode.ThreadDemo;

/**
 * 描述：
 * 线程
 *
 * @author wushunyu
 * @date 2020/4/1
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Java线程对象Thread的状态包括：New、Runnable、Blocked、Waiting、Timed Waiting和Terminated;

        System.out.println("Main start");

//        Thread thread = new MyThread();
//        thread.start();
//
//        Runnable myRunnable = new MyRunnable();
//        myRunnable.run();
//
//        Thread t = new Thread(
//                () -> {
//                    System.out.println("java 8 thread start");
//                }
//        );
//        t.start();
//        //等待t这个线程执行完
//        t.join();


//        //interrupt中断一个线程
//        Thread t = new MyThread();
//        t.start();
//        Thread.sleep(1);
//        t.interrupt();
//        t.join();

        Thread t = new MyThread();
        t.start();
        Thread.sleep(10000);
        t.interrupt();// 中断t线程
        t.join();// 等待t线程结束



        System.out.println("Main end");

    }
}
