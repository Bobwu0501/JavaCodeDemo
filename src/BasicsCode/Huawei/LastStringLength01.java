package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * @author bobwu
 * @Title: LastStringLength01
 * @ProjectName niukecode
 * @date 2020-04-1810:46
 */
public class LastStringLength01 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        System.out.println(strings[strings.length-1].length());

    }


}
