package BasicsCode.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/31
 */
public class Main {
    public static void main(String[] args) throws Exception {

        //通过Class实例获取所有Field对象
        Object maque = new Bird("blue");
        Class<?> c = maque.getClass();

        Field f = c.getDeclaredField("color");
        //当Bird中的字段color是private时，需要设置该字段为允许访问;或者将该字段设置成public
        f.setAccessible(true);

        Object value = f.get(maque);
        System.out.println(value);

        //通过Class实例获取所有Method信息
        Class birdClass = Bird.class;
        Bird bird = new Bird();
        //获取public - fly()方法，参数为String
        Method fly = birdClass.getMethod("fly", String.class);
        //需要传递一个对象进去bird
        String asd = (String)fly.invoke(bird, "xique");
        System.out.println(asd);

        //private - sing()
        Method sing = birdClass.getDeclaredMethod("sing", int.class);
        sing.setAccessible(true);
        //不传对象进去打印的是private java.lang.Integer BasicsCode.reflection.Bird.sing(int)
        System.out.println(sing);

        //调用静态方法
        Method smile = birdClass.getMethod("smile", String.class);
        String zhuzhu = (String)smile.invoke(null, "zhuzhu");
        System.out.println(zhuzhu);


    }
}
