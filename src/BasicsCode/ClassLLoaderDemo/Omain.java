package BasicsCode.ClassLLoaderDemo;

import java.util.*;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/24
 */
public class Omain {

    public String str = "6";
    public static void main(String[] args) {
        Integer q = 50;
        int w= 50;
        Integer e = Integer.valueOf(50);
        System.out.println(q==e);
    }


    public  void op(String str){
        str = "10";
    }



}
