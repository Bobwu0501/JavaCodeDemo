package BasicsCode.AbstractDemo;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/3/31
 */
public interface Car {

    void run();

    void lunzi();

    default void jiayou(){
        System.out.println("jiayou");
    }






}
