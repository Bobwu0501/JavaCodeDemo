package CCFCode.Test2013;

import java.util.*;

/**
 * 描述：
 * 出现次数最多的数
 *
 * @author wushunyu
 * @date 2019/9/3
 */
public class Test20191201 {


    public static void main(String[] args) {

      new Test20191201().run();

    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < num; i++) {
            int a = scanner.nextInt();
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else {
                Integer n = map.get(a);
                map.put(a, n+1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        int minNum = 10000;

        Integer max = Collections.max(map.values());
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() == max){
                int p = entry.getKey();
                if (p < minNum){
                    minNum = p;
                }
            }
        }
        System.out.println(minNum);
    }


}
