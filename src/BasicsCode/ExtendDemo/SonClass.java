package BasicsCode.ExtendDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/30
 */
public class SonClass extends ParentClass{


    public static String son = "son";

    protected String protectedStr = "protectedStr";

    public static void sonMethod() {
        System.out.println("sonStaticMethod");
    }

    public void sonCommonMethod() {
        System.out.println("sonCommonMethod");
    }

    public SonClass() {
        System.out.println("sonConstructor");
    }

}
