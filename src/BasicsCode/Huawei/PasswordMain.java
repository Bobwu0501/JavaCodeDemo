package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/13
 */
public class PasswordMain {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            if (lengthOk(str) && volidateTag(str) && repeat(str)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    public static Boolean lengthOk(String string) {
        if (string.length() > 8) {
            return true;
        } else {
            return false;
        }
    }


    public static Boolean volidateTag(String string) {
        int upNum = 0;
        int lowNum = 0;
        int num = 0;
        int tag = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                upNum = 1;
                continue;
            }
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                lowNum = 1;
                continue;
            }
            if (chars[i] >= '0' && chars[i] <= '9') {
                num = 1;
                continue;
            } else {
                tag = 1;
                continue;
            }
        }
        int total = upNum + lowNum + num + tag;
        return total >= 3 ? true : false;
    }

    public static Boolean repeat(String string) {

        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length - 2; i++) {
            String substr = string.substring(i, i + 3);
            if (string.substring(i + 1).contains(substr)) {
                return false;
            }
        }
        return true;
    }
}
