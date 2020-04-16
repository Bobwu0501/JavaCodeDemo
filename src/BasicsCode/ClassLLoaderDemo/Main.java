package BasicsCode.ClassLLoaderDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/2
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        //FDD类属于自己写的，去Application classLoader去找
        ClassLoader classLoader = FDD.class.getClassLoader();
        System.out.println("classLoader: " + classLoader);//classLoader: sun.misc.Launcher$AppClassLoader@18b4aac2

        //String类属于java自带，去bootstrap classLoader去找  【bootstrap classLoader是c++写的 所以为null】
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println("classLoader1: " + classLoader1);//classLoader1: null

        //使用ClassLoader.loadClass()来加载类，不会执行初始化块
        System.out.println("ClassLoader.loadClass(): " + classLoader.loadClass("BasicsCode.ClassLLoaderDemo.FDD"));//class BasicsCode.ClassLLoaderDemo.FDD
        System.out.println("-------------------");

        //使用Class.forName()来加载类，默认会执行初始化块
        System.out.println("Class.forName(): " + Class.forName("BasicsCode.ClassLLoaderDemo.FDD"));//static code     Class.forName(): class BasicsCode.ClassLLoaderDemo.FDD
        //使用Class.forName()来加载类，指定ClassLoader，初始化时不执行静态块
        System.out.println("Class.forName(),指定ClassLoader: " + Class.forName("BasicsCode.ClassLLoaderDemo.FDD",false,classLoader));//Class.forName(),指定ClassLoader: class BasicsCode.ClassLLoaderDemo.FDD

    }


}
