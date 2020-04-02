package BasicsCode.ThreadDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/1
 */
public class HelloThread extends Thread{

    @Override
    public void run() {
        int n = 0;
        while (!isInterrupted()){
            n++;
            System.out.println(n+ " hello!");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("exception");
                break;
            }
        }
    }
}
