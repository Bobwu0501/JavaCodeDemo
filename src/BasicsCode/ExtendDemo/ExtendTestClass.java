package BasicsCode.ExtendDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/30
 */
public class ExtendTestClass {

    public static void main(String[] args) {

        //静态方法直接调用
        SonClass.sonMethod();
        //普通方法通过对象调用
        SonClass sonClass = new SonClass();
        sonClass.sonCommonMethod();

        //public  和  protect 可以
        System.out.println(SonClass.son);
        sonClass.protectedStr = "adsad";
        System.out.println(sonClass.protectedStr);


    }
}
