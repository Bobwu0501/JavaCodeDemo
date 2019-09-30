package DesignPattern.AbstractFactory;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2019/9/30
 */
public class BMW320Factory implements BMWFactory {

    @Override
    public BMW320 createBmw() {
        return new BMW320();
    }
}
