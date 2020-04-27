package BasicsCode.Huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author bobwu
 * @Title: StringConnect014
 * @ProjectName niukecode
 * @date 2020-04-1822:04
 */
public class StringConnect014 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            scanner.nextLine();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                String str = scanner.nextLine();
                list.add(str);
            }
            Collections.sort(list);
            for (String str : list) {
                System.out.println(str);
            }
        }


    }


}
