package BasicsCode.Huawei;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author bobwu
 * @Title: PasswordIdentify020
 * @ProjectName niukecode
 * @date 2020-04-1914:41
 */
public class PasswordIdentify020 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String password = scanner.nextLine();
            if (identify(password) && continesString(password)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    public static boolean identify(String password) {
        if (password.length() < 8) {
            return false;
        }
        int bigCount = 0;
        int smallCount = 0;
        int num = 0;
        int other = 0;
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                bigCount = 1;
                continue;
            }
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                smallCount = 1;
                continue;
            }
            if (chars[i] >= '0' && chars[i] <= '9') {
                num = 1;
                continue;
            } else {
                other = 1;
                continue;
            }
        }
        if (bigCount + smallCount + num + other >= 3) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean continesString(String password) {
        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < password.length() - 3; i++) {
            String str = password.substring(i, i + 3);
            if (hashMap.containsKey(str)) {
                System.out.println(str);
                return false;
            }
            hashMap.put(str, "");
        }
        return true;
    }
}
