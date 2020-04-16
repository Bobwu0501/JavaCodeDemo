package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/13
 */
public class PassMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            char[] chars = string.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= 'A' && chars[i] <= 'Z') {
                    if ((chars[i] + 32) == 'z') {
                        chars[i] = 'a';
                        continue;
                    } else {
                        chars[i] = (char) (chars[i] + 32 + 1);
                        continue;
                    }
                }
                if (chars[i] >= 'a' && chars[i] <= 'z') {
                    if (chars[i] >= 'a' && chars[i] <= 'c') {
                        chars[i] = '2';
                        continue;
                    }
                    if (chars[i] >= 'd' && chars[i] <= 'f') {
                        chars[i] = '3';
                        continue;
                    }
                    if (chars[i] >= 'g' && chars[i] <= 'i') {
                        chars[i] = '4';
                        continue;
                    }
                    if (chars[i] >= 'j' && chars[i] <= 'l') {
                        chars[i] = '5';
                        continue;
                    }
                    if (chars[i] >= 'm' && chars[i] <= 'o') {
                        chars[i] = '6';
                        continue;
                    }
                    if (chars[i] >= 'p' && chars[i] <= 's') {
                        chars[i] = '7';
                        continue;
                    }
                    if (chars[i] >= 't' && chars[i] <= 'v') {
                        chars[i] = '8';
                        continue;
                    }
                    if (chars[i] >= 'w' && chars[i] <= 'z') {
                        chars[i] = '9';
                        continue;
                    }
                }

            }
            System.out.println(String.valueOf(chars));
        }

    }
}
