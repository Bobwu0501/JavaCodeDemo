package BasicsCode.Huawei;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class MergeRows08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String str = scanner.nextLine();
            String[] array = str.split(" ");
            if (treeMap.get(Integer.valueOf(array[0])) != null){
                Integer newNum = treeMap.get(Integer.valueOf(array[0])) + Integer.valueOf(array[1]);
                treeMap.put(Integer.valueOf(array[0]), newNum);
            }else {
                treeMap.put(Integer.valueOf(array[0]), Integer.valueOf(array[1]));
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            Integer key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + " " + value);
        }
    }
}
