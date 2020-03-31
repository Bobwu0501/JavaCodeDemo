package BasicsCode.StringDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/30
 */
public class StaticDemo {

    class InnerClass{

    }

    static class StaticInnerClass{

    }


    static {
        System.out.println("123");
    }

    public static void main(String[] args) {
        //静态语句块在类初始化时运行一次。
        StaticDemo a1 = new StaticDemo();
        StaticDemo a2 = new StaticDemo();

        //需要先创建外部类实例，才能用这个实例去创建非静态内部类
        StaticDemo staticClass = new StaticDemo();
        InnerClass innerClass = staticClass.new InnerClass();

        //静态内部类可以直接创建
        StaticInnerClass staticInnerClass = new StaticInnerClass();





    }
}
