package BasicsCode.ThreadDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/22
 */
public class DiffMain {
    public static void main(String[] args) {
//        Thread thread1 = new DifferentDemo();
//        Thread thread2 = new DifferentDemo();
//        Thread thread3 = new DifferentDemo();
//        Thread thread4 = new DifferentDemo();
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();


        DifferentRunDemo runnable = new DifferentRunDemo();
        Thread thread10 = new Thread(runnable);
        Thread thread11 = new Thread(runnable);
        Thread thread12 = new Thread(runnable);
        Thread thread13 = new Thread(runnable);
        thread10.start();
        thread11.start();
        thread12.start();
        thread13.start();





    }
}
