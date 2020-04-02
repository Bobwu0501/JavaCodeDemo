package BasicsCode.InvokeDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/2
 */
public class A {
    public void show(A a) {
        System.out.println("A.show(A)");
    }

    public void show(C c) {
        System.out.println("A.show(C)");
    }
}
