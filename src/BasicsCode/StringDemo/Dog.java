package BasicsCode.StringDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/30
 */
public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getObjectAddress(){
        return super.toString();
    }
}
