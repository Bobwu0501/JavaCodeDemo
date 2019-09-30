package DesignPattern.AbstractFactory;

/**
 * 描述：
 * https://blog.csdn.net/jason0539/article/details/44976775
 * @author wushunyu
 * @date 2019/9/30
 */
public interface AbstractFactory {

    public Engine createEngine();

    public Aircondition createAircondition();

}
