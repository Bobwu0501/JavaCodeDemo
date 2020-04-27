package BasicsCode.Huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author bobwu
 * @Title: NoRepeatNumber
 * @ProjectName niukecode
 * @date 2020-04-1817:22
 */
public class NoRepeatNumber09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            Integer num = scanner.nextInt();
            String str = num.toString();
            char[] chars = str.toCharArray();
            ArrayList<Character> list = new ArrayList<>();

            for (int i = chars.length - 1; i >= 0; i--) {
                if (!list.contains(chars[i])) {
                    list.add(chars[i]);
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (Character c : list) {
                stringBuffer.append(c);
            }
            System.out.println(stringBuffer);
        }
    }
}
