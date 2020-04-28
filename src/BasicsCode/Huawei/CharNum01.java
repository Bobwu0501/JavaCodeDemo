package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * @author bobwu
 * @Title: CharNum01
 * @ProjectName niukecode
 * @date 2020-04-1810:54
 */
public class CharNum01 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String charAt = scanner.next();
        char[] chars = string.toCharArray();

        int num = 0;
        for (int i = 0; i < string.length(); i++) {

            if (chars[i] == charAt.toCharArray()[0]) {
                num++;
            }
        }
        System.out.println(num);


    }


}
