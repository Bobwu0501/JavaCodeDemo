package BasicsCode.Huawei;

import java.util.*;

/**
 * @author bobwu
 * @Title: DeleteCharInString
 * @ProjectName niukecode
 * @date 2020-04-1916:53
 */
public class DeleteCharInString023 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            getExitMinumChar(str);
        }
    }


    public static void getExitMinumChar(String string) {
        char[] chars = string.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            char aChar = chars[i];
            for (int j = i + 1; j < chars.length; j++) {
                if (aChar == chars[j]) {
                    count++;
                }
            }
            if (!hashMap.containsKey(aChar)) {
                hashMap.put(aChar, count);
            } else {
                continue;
            }
        }
        Iterator<Map.Entry<Character, Integer>> iterator = hashMap.entrySet().iterator();
        List<Character> list = new ArrayList<>();
        int num = 0;
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> next = iterator.next();
            if (list.size() == 0){
                list.add(next.getKey());
                num = next.getValue();
                continue;
            }
            if (next.getValue() < num) {
                list.clear();
                list.add(next.getKey());
                num = next.getValue();
            }
            if (next.getValue() == num){
                list.add(next.getKey());
            }
        }
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; i < chars.length; i++) {
            if (!list.contains(chars[i])) {
                stringBuffer = stringBuffer.append(chars[i]);
            }
        }
        System.out.println(stringBuffer.toString());
    }
}
