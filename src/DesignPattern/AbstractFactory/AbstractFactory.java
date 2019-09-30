package DesignPattern.AbstractFactory;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2019/9/30
 */
public interface AbstractFactory {

    public Engine createEngine();

    public Aircondition createAircondition();

}
