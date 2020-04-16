package BasicsCode.ThreadDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/3
 */
public class RunStartMain {

    private static void attack(){
        System.out.println("Fight");
        System.out.println("当前线程： " + Thread.currentThread().getName());
    }


    public static void main(String[] args) {

//        Thread t = new Thread(){
//            public void run(){
//                attack();
//            }
//        };
//        System.out.println("当前主线程是: " + Thread.currentThread().getName());
//        t.run();



        MyStart myStart =  new MyStart();
//        myStart.run();
        myStart.start();

    }
}
