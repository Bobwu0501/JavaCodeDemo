package BasicsCode.ThreadDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/22
 */
public class DifferentDemo extends Thread {

    private int ticket = 10;

    @Override
    public void run() {
        while (true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName() + "  --ticket : " + ticket-- );
            }
        }

    }
}
