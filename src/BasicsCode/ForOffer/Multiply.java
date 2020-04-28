package BasicsCode.ForOffer;

import java.util.Scanner;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/21
 */
public class Multiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] strings = s.split(" ");
            int n = Integer.valueOf(strings[0]);
            for (int i = 1; i < strings.length; i++) {
                n = n ^ Integer.valueOf(strings[i]);
            }
            System.out.println(n);
        }
    }
}
