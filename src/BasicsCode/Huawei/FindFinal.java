package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/21
 */
public class FindFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] s = str.split(" ");
            int[] array = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                array[i] = Integer.valueOf(s[i]);
            }

            int min = 1;
            int index = 0;
            int start = array.length - 1;
            while (start >= array.length / 2) {
                for (int i = start; i > 0; i--) {
                    if (array[i] == start - i) {
                        index = i;
                    }
                }
                start = index;
                min++;
            }

            if (index == 0) {
                min = -1;
            }
            System.out.println(min);
        }


    }

}
