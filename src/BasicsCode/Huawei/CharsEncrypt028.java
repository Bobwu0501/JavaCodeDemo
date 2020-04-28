package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * 描述：
 * 字符串加解密
 *
 * @author wushunyu
 * @date 2020/4/20
 */
public class CharsEncrypt028 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String needEncrypt = scanner.nextLine();
            String needUnEncrypt = scanner.nextLine();
            Encrypt(needEncrypt);
            UnEncrypt(needUnEncrypt);
        }
    }

    //加密
    public static void Encrypt(String string) {
        char[] chars = string.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (chars[i] == 'z') {
                    stringBuffer.append('A');
                    continue;
                }
                stringBuffer.append((char) (chars[i] + 1 - 32));
                continue;
            }
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (chars[i] == 'Z') {
                    stringBuffer.append('a');
                    continue;
                }
                stringBuffer.append((char) (chars[i] + 1 + 32));
                continue;
            }
            if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                if (string.charAt(i) == '9') {
                    stringBuffer.append('0');
                    continue;
                }
                stringBuffer.append(Integer.valueOf(string.charAt(i)) - 48 + 1);
                continue;
            }
        }

        System.out.println(stringBuffer.toString());
    }

    //加密
    public static void UnEncrypt(String string) {
        char[] chars = string.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (chars[i] == 'a') {
                    stringBuffer.append('Z');
                    continue;
                }
                stringBuffer.append((char) (chars[i] - 1 - 32));
                continue;
            }
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (chars[i] == 'A') {
                    stringBuffer.append('z');
                    continue;
                }
                stringBuffer.append((char) (chars[i] - 1 + 32));
                continue;
            }
            if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                if (string.charAt(i) == '0') {
                    stringBuffer.append('9');
                    continue;
                }
                stringBuffer.append(Integer.valueOf(string.charAt(i)) - 48 - 1);
                continue;
            }
        }

        System.out.println(stringBuffer.toString());
    }
}
