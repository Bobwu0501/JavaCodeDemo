package BasicsCode.Singleton;

/**
 * 懒汉式
 *
 * @author bobwu
 * @Title: LazySingleton
 * @ProjectName niukecode
 * @date 2020-04-2622:15
 */
public class LazySingleton {


    //存在的问题：
    //当有多个线程并行调用 getInstance() 的时候，就会创建多个实例
    //不是线程安全

    /**
     * 懒汉式其实是一种比较形象的称谓。既然懒，那么在创建对象实例的时候就不着急。
     * 会一直等到马上要使用对象实例的时候才会创建，
     * 懒人嘛，总是推脱不开的时候才会真正去执行工作，因此在装载对象的时候不创建对象实例。
     */

    private static LazySingleton lazySingleton;


    private LazySingleton() {
    }

    ////懒汉式的线程不安全版本
    public static LazySingleton getLazySingleton() {

        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }

    //懒汉式的线程安全版本
    public static synchronized LazySingleton getLazySingletonV1() {

        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }

}
