package DesignPattern.Singleton;

/**
 * 描述：
 * 单例模式
 *
 * @author wushunyu
 * @date 2019/10/8
 */
//懒汉式单例类.在第一次调用的时候实例化自己
//懒汉式单例的实现没有考虑线程安全问题，它是线程不安全的，并发环境下很可能出现多个Singleton实例
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton = null;

    //静态工厂方法
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
