package BasicsCode.Singleton;

/**
 * @author bobwu
 * @Title: DoubleCheckedSingleton
 * @ProjectName niukecode
 * @date 2020-04-2622:36
 */
public class DoubleCheckedSingleton {

    //双重检验锁


    /**
     * 程序员称其为双重检查锁，因为会有两次检查 instance == null，一次是在同步块外，一次是在同步块内。
     * 为什么在同步块内还要再检验一次？
     * 因为可能会有多个线程一起进入同步块外的 if，如果在同步块内不进行二次检验的话就会生成多个实例了。
     */

    //V1
    //这一步不能保证下面instance = new DoubleCheckedSingleton();执行正确
    //因为会发生指令重排序
    private static DoubleCheckedSingleton instance;


    //V2  --将V1修改为以下这个
    //加上volatile可以防止重排序
    private static volatile DoubleCheckedSingleton singleton;

    private DoubleCheckedSingleton() {

    }

    public static DoubleCheckedSingleton getInstance() {

        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
