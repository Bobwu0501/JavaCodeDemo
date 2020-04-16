package BasicsCode.HashMapTest;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/14
 */
public class Main {


    public static void main(String[] args) {


        Map map = new HashMap<>();
        map.put("asd","qqq");

        System.out.println(map.get("asd").hashCode());
    }
}
