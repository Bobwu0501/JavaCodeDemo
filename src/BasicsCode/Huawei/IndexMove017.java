package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * @author bobwu
 * @Title: IndexMove017
 * @ProjectName niukecode
 * @date 2020-04-1823:11
 */
public class IndexMove017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            String[] arrays = str.split(";");
            int i = 0;
            int j = 0;

            for (int m = 0; m < arrays.length; m++) {
                try {
                    Integer value = 0;
                    if (arrays[m].length() > 1) {
                        value = Integer.valueOf(arrays[m].substring(1));
                        if (!(value >= 0 && value <= 99)) {
                            continue;
                        }
                    } else {
                        continue;
                    }

                    Character c = arrays[m].charAt(0);
                    switch (c) {
                        case 'A':
                            i -= value;
                            continue;
                        case 'D':
                            i += value;
                            continue;
                        case 'W':
                            j += value;
                            continue;
                        case 'S':
                            j -= value;
                            continue;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
            System.out.println(i + "," + j);
        }
    }
}
