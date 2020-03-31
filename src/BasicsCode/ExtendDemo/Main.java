package BasicsCode.ExtendDemo;

import BasicsCode.StringDemo.P;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/30
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "bob";
        System.out.println(p.hello());
        Student s = new Student();
        System.out.println(s.hello());
    }

}

class Person {
    protected String name;

    public String hello() {
        return "Hello, " + name;
    }
}

class Student extends Person {
    @Override
    public String hello() {
        // 调用父类的hello()方法:
        return super.hello() + "!";
    }
}


