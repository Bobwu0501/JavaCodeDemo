package BasicsCode.DynamicProxy;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/31
 */
public class HelloImpl implements Hello{

    @Override
    public void morning(String name) {
        System.out.println("Good morning, " + name);
    }
}
