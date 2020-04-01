package BasicsCode.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 描述：
 * 动态代理
 *
 * @author wushunyu
 * @date 2020/3/31
 */
public class Main {


    public static void main(String[] args) {

        //一般来说，定义一个接口，他的实现类必须实现他的所有方法
        //一般我们通过接口调用方法
        Hello hello = new HelloImpl();
        hello.morning("Bob");

        //有没有可能不编写实现类，直接在运行期创建某个interface的实例呢？
        //动态代理（Dynamic Proxy）的机制 : 可以在运行期动态创建某个interface的实例。

        //一个简单的动态代理
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method + "----begin");//可以在方法前后打印日志
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning! " + args[0]);
                }
                System.out.println(method + "----end");
                return null;
            }
        };
        Hello helloProxy = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),// 传入ClassLoader
                new Class[]{Hello.class},// 传入要实现的接口
                handler);// 传入处理调用方法的InvocationHandler
        helloProxy.morning("Jack");

    }


}
