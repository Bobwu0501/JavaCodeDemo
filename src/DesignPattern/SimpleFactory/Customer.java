package DesignPattern.SimpleFactory;

/**
 * 描述：
 * https://blog.csdn.net/jason0539/article/details/44976775
 * @author wushunyu
 * @date 2019/9/30
 */
public class Customer {
    public static void main(String[] args) {
        BMWFactory bmwFactory = new BMWFactory();
        BMW bmw = bmwFactory.createBMW(320);
    }
}
