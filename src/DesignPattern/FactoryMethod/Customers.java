package DesignPattern.FactoryMethod;

/**
 * 描述：
 * https://blog.csdn.net/jason0539/article/details/44976775
 * @author wushunyu
 * @date 2019/9/30
 */
public class Customers {

    public static void main(String[] args) {
        BMW320Factory bmw320Factory = new BMW320Factory();
        bmw320Factory.createBmw();
    }
}
