package BasicsCode.ThreadDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/1
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        int n = 0;
        while (!isInterrupted()){
            n++;
            System.out.println(n + "MyThread run");
        }

    }

//    @Override
//    public void run() {
//        Thread hello = new HelloThread();
//        hello.start();// 启动hello线程
//        try{
//            hello.join();// 等待hello线程结束
//        }catch (InterruptedException e){
//            System.out.println("interrupted!");
//        }
//        hello.interrupt();
//    }
}
