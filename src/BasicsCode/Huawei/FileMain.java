package BasicsCode.Huawei;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/13
 */
public class FileMain {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

        while (scanner.hasNext()) {
            String str = scanner.next();
            int linenum = scanner.nextInt();
            String[] arr = str.split("\\\\");
            String s = arr[arr.length - 1];
            if (s.length() > 16) {
                s = s.substring(s.length() - 16);
            }
            String key = s + " " + linenum;
            int value = 1;
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, value);
            }
        }

        int count = 0;
        for (String str : map.keySet()) {
            count++;
            if (count>(map.keySet().size() - 8)){
                System.out.println(str + " " + map.get(str));
            }
        }
    }
}
