package BasicsCode.autoBoxing;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 * 自动拆箱和装箱
 *
 * @author wushunyu
 * @date 2020/3/26
 */
public class AutoBoxing {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        //自动装箱  1(int)-->1(Integer)  [3 --> Integer.valueOf(3)]
        list.add(1);
        list.add(2);
        list.add(Integer.valueOf(3));
        list.add(Integer.valueOf(4));

        int sum = 0;
        for (Integer i : list) {
            //自动拆箱
            if (i % 2 == 0) {
                //自动拆箱   [i.intValue()]
                System.out.println("i: " + i.intValue());
                sum += i;
            }
        }
        System.out.println("sum: " + sum);
    }
}
