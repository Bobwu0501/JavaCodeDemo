package BasicsCode.InvokeDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/22
 */
public class InvokeMain {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<?> aClass = Class.forName("BasicsCode.InvokeDemo.A");
        A a = (A) aClass.newInstance();
        a.show(a);


        A a1 = A.class.newInstance();



    }


}
