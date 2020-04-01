package BasicsCode.reflection;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/31
 */
public class Bird {

    private String color;

    public Bird() {
    }

    public Bird(String color) {
        this.color = color;
    }

    public static String smile(String smile){
        return smile;
    }

    public String fly(String name) {
        String birdFly = name + " fly";
        return birdFly;
    }

    private Integer sing(int num) {
        return num;
    }
}
