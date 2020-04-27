package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * @author bobwu
 * @Title: ReverseString012
 * @ProjectName niukecode
 * @date 2020-04-1818:21
 */
public class ReverseString012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String s = scanner.nextLine();
            StringBuffer stringBuffer = new StringBuffer(s);
            System.out.println(stringBuffer.reverse());
        }
    }

}
