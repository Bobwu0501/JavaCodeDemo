package DesignPattern.AbstractFactory;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2019/9/30
 */
public class Customer {
    public static void main(String[] args) {
        BMW320Factory bmw320Factory = new BMW320Factory();
        bmw320Factory.createEngine();
        bmw320Factory.createAircondition();

    }
}
