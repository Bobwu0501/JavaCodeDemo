package BasicsCode.reflection;

/**
 * 描述：
 * 反射
 *
 * @author wushunyu
 * @date 2020/3/31
 */
public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = String.class;

        Class aaa = Class.forName("java.lang.String");

        System.out.println(aaa == cls);

    }

}

