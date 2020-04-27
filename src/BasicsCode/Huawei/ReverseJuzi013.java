 package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * @author bobwu
 * @Title: ReverseJuzi013
 * @ProjectName niukecode
 * @date 2020-04-1821:58
 */
public class ReverseJuzi013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {

            String sentence = scanner.nextLine();
            System.out.println(reverse(sentence));
        }
    }


    public static String reverse(String sentence) {

        String[] strings = sentence.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = strings.length - 1; i >= 0; i--) {
            stringBuffer.append(strings[i]);
            if (i != 0) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

}
