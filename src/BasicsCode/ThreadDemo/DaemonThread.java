package BasicsCode.ThreadDemo;

/**
 * 描述：
 * 守护线程
 *
 * @author wushunyu
 * @date 2020/4/1
 */
public class DaemonThread {

    public static void main(String[] args) {
        Thread t = new MyThread();
        //在start()之前，设置Daemon为true，将此线程标记位守护线程
        t.setDaemon(true);
        t.start();
        //守护线程不能持有任何需要关闭的资源，例如打开文件等，因为虚拟机退出时，守护线程没有任何机会来关闭文件，这会导致数据丢失。
    }
}
