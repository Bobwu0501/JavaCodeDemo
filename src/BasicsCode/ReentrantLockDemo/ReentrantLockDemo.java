package BasicsCode.ReentrantLockDemo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author bobwu
 * @Title: ReentrantLockDemo
 * @ProjectName niukecode
 * @date 2020-04-2321:35
 */
public class ReentrantLockDemo implements Runnable {

    private static ReentrantLock lock = new ReentrantLock(true);


    @Override
    public void run() {

        while (true){
            try {
                lock.lock();
                System.out.println(lock.isLocked() + " " + lock.isHeldByCurrentThread());
                System.out.println(Thread.currentThread().getName() + "- get lock");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }


    public static void main(String[] args) {
        ReentrantLockDemo reentrantLockDemo = new ReentrantLockDemo();
        Thread thread1 = new Thread(reentrantLockDemo);
        Thread thread2 = new Thread(reentrantLockDemo);
        thread1.start();
        thread2.start();

    }
}
