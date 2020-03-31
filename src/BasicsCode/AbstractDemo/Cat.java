package BasicsCode.AbstractDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/30
 */
public class Cat extends Animal{

    @Override
    public void run() {
        System.out.println("cat run");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void fly() {
        System.out.println("cat fly");
    }

}
