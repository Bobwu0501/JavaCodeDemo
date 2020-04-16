package BasicsCode.Huawei;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/13
 */
public class Test {                         //1.第一步，准备加载类

    public static void main(String[] args) {
        new Test();                         //4.第四步，new一个类，但在new之前要处理匿名代码块
        new Test();                         //9.除了静态的方法和静态变量，其他的都再执行一次
    }

    static int num = 4;                    //2.第二步，静态变量和静态代码块的加载顺序由编写先后决定


    {
        num += 3;
        System.out.println("b");           //5.第五步，按照顺序加载匿名代码块，代码块中有打印
    }

    int a = 5;                             //6.第六步，按照顺序加载变量  [成员普通变量在类的构造方法之前执行，他和匿名构造方法的顺序看编写的顺序]

    { // 成员变量第三个
        System.out.println("c");           //7.第七步，按照顺序打印c
    }

    Test() { // 类的构造函数，第四个加载
        System.out.println("d");           //8.第八步，最后加载构造函数，完成对象的建立
    }



    static {                              // 3.第三步，静态块，然后执行静态代码块，因为有输出，故打印a
        System.out.println("a");
    }

    static void run()                    // 静态方法，调用的时候才加载// 注意看，e没有加载
    {
        System.out.println("e");
    }
}
