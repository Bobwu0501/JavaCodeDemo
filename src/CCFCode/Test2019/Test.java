package CCFCode.Test2019;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2019/9/11
 */
public class Test {
    public static void main(String[] args) {

        String str = new String("hello");
        String str1 = "hello";
        String str2 = "hello";
        System.out.println("strAddr: " + System.identityHashCode(str));
        System.out.println("str1Addr: " + System.identityHashCode(str1));
        System.out.println("str2Addr: " + System.identityHashCode(str2));
        if (str == str1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
