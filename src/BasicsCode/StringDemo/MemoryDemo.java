package BasicsCode.StringDemo;

/**
 * 描述：
 * intern()方法
 *
 * @author wushunyu
 * @date 2020/4/1
 */
public class MemoryDemo {

    public static void main(String[] args) {

        String s1 = new String("a");
        s1.intern();
        String s2 = "a";
        System.out.println(s1 == s2);

        String s3 = new String("a") + new String("a");
        s3.intern();
        String s4 = "aa";
        System.out.println(s3 == s4);

    }
}
