package BasicsCode.reflection;

import java.lang.reflect.Field;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/31
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Object maque = new Bird("blue");
        Class<?> c = maque.getClass();

        Field f = c.getDeclaredField("color");
        //当Bird中的字段color是private时，需要设置该字段为允许访问;或者将该字段设置成public
        f.setAccessible(true);

        Object value = f.get(maque);
        System.out.println(value);
    }
}
