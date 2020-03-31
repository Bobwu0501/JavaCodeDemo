package BasicsCode.StringDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/30
 */
public class PTest {


    static P p1 = new P("p1");

    public static void main(String[] args) {
        final Dog dog = new Dog("adad");

        P p = new P("P");
        System.out.println("before change p:" + p.toString());
        changeObj(p);
        System.out.println("after change p：" + p.toString());
    }

    static void changeObj(P p) {
        p = new P("pp");
        System.out.println("change p:" + p.toString());
    }

}
