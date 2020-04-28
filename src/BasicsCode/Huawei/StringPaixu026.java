package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/20
 */
public class StringPaixu026 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();

            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < 26; i++) {
                char c = (char) (i + 'A');
                for (int j = 0; j < str.length(); j++) {
                    char cc = str.charAt(j);
                    if (c == cc || c == cc - 32) {
                        stringBuffer.append(cc);
                    }
                }
            }

            for (int k = 0; k < str.length(); k++) {
                if (!(('A' <= str.charAt(k) && 'Z' >= str.charAt(k)) || ('a' <= str.charAt(k) && 'z' >= str.charAt(k)))) {
                    stringBuffer.insert(k, str.charAt(k));
                }
            }
            System.out.println(stringBuffer.toString());
        }
    }
}
