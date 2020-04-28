package BasicsCode.Huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author bobwu
 * @Title: CharNumSum
 * @ProjectName niukecode
 * @date 2020-04-1817:58
 */
public class CharNumSum010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String str = scanner.nextLine();
            char[] chars = str.toCharArray();
            ArrayList<Character> list = new ArrayList<>();

            int ans = 0;
            for (int i = 0; i < chars.length; i++) {
                if (Integer.valueOf(chars[i]) >= 0 && Integer.valueOf(chars[i]) <= 127 && !list.contains(chars[i])) {
                    list.add(chars[i]);
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
