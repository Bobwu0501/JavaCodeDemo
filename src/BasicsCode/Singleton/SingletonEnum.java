package BasicsCode.Singleton;

/**
 * @author bobwu
 * @Title: SingletonEnum
 * @ProjectName niukecode
 * @date 2020-04-2623:12
 */
public enum SingletonEnum {

    /**
     * 可以通过EasySingleton.INSTANCE来访问实例，这比调用getInstance()方法简单多了。
     * 创建枚举默认就是线程安全的，所以不需要担心double checked locking，而且还能防止反序列化导致重新创建新的对象
     */

    SINGLETON_ENUM;


}
