package BasicsCode.ExtendDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/30
 */
public class ParentClass {

    public static String parent = "parent";

    public static void parentMethod() {
        System.out.println("parentStaticMethod");
    }

    private void parentCommonMethod() {
        System.out.println("parentCommonMethod");
    }

    public ParentClass() {
        System.out.println("parentConstructor");
    }
}
