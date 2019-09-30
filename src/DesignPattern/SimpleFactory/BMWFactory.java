package DesignPattern.SimpleFactory;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2019/9/30
 */
public class BMWFactory {

    public BMW createBMW(int type){
        switch (type){
            case 320:
                return new BMW320();
            case 523:
                return new BMW523();
            default:
                break;
        }
        return null;
    }
}
