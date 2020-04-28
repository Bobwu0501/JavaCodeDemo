package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * @author bobwu
 * @Title: NumReverse011
 * @ProjectName niukecode
 * @date 2020-04-1818:12
 */
public class NumReverse011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String s = scanner.nextLine();
            StringBuffer stringBuffer = new StringBuffer(s);
            stringBuffer.reverse();
            System.out.println(stringBuffer);
        }
    }



}
