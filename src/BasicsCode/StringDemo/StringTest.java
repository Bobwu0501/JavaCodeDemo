package BasicsCode.StringDemo;

/**
 * 描述：
 * String类
 *
 * @author wushunyu
 * @date 2020/3/26
 */
public class StringTest {


    public static void main(String[] args) {

        //String 被声明为 final，因此它不可被继承。


        //都是传值【可能是地址】，不是传引用
        Dog dog = new Dog("A");
        System.out.println(dog.getName());
        System.out.println(dog.getObjectAddress());
//        func(dog);
//        System.out.println(dog.getName());
//        System.out.println(dog.getObjectAddress());
        dog = func2(dog);
        System.out.println(dog.getName());
        System.out.println(dog.getObjectAddress());

        System.out.println("------------------");
        //final
        String a = "hello2";
        final String b = "hello";  //由于变量b被final修饰，因此会被当做编译器常量，所以在使用到b的地方会直接将变量b 替换为它的值
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));

        System.out.println("c: " + c);
        System.out.println("e: " + e);
        System.out.println("a == e " + (a == e));
        String f = "hello2";
        System.out.println("a == f " + (a == f));


        System.out.println("------------------");
        //final & static
        //static作用于成员变量用来表示只保存一份副本，而final的作用是用来保证变量不可变
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println(myClass1.i);
        System.out.println(myClass1.j);
        System.out.println(myClass2.i);
        System.out.println(myClass2.j);//每次打印的两个j值都是一样的，而i的值却是不同的



    }


    private static void func(Dog dog) {
        dog.setName("B");
        System.out.println(dog.getName());
        System.out.println(dog.getObjectAddress());
    }

    private static Dog func2(Dog dog) {
        System.out.println(dog.getName());
        dog = new Dog("C");
        System.out.println(dog.getName());
        System.out.println(dog.getObjectAddress());
        dog.setName("D");
        System.out.println(dog.getName());
        System.out.println(dog.getObjectAddress());
        return dog;
    }

}
