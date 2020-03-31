package BasicsCode.AbstractDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/30
 */
public abstract class Animal {

    private String ha;

    public void eat(){
        System.out.println("eat");
    }

    public void fly(){};

    public abstract void run();

}
