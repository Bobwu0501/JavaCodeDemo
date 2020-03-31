package BasicsCode.AbstractDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/30
 */
public class Main {

    public static void main(String[] args) {
        //一个类中有抽象方法，那么这个类必须用abstract修饰
        //抽象类中可以没有抽象方法，但是这样的话就没有啥意义了

        //Cat是一个普通类 而Animal是一个抽象类
        //Cat必须实现其父类的抽象方法
        //可以重写其父类的普通方法
        Cat cat = new Cat();
        cat.eat();
        cat.run();
        cat.fly();

        //抽象类 new的时候必须将其中的抽象方法都实现了
        Animal animal = new Animal() {
            @Override
            public void run() {
                System.out.println("animal run");
            }
        };
        animal.run();


        //接口
        //接口可以
        //接口默认规则是  public abstract
        //接口中有default方法
        Volvo volvo = new Volvo();
        volvo.lunzi();
        volvo.run();
        volvo.jiayou();

        String str = "str";


    }
}
