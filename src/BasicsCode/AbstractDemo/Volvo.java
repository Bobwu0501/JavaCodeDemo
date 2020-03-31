package BasicsCode.AbstractDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/31
 */
public class Volvo implements Car , Fruit{


    @Override
    public void run() {
        System.out.println("volvo run");
    }

    @Override
    public void lunzi() {
        System.out.println("volvo lunzi");
    }

    @Override
    public void xi() {
        System.out.println("volvo xi");
    }
}
