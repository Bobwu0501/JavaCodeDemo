package DesignPattern.AbstractFactory;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2019/9/30
 */
public class BMW523Factory implements BMWFactory {
    @Override
    public BMW523 createBmw() {
        return new BMW523();
    }
}
