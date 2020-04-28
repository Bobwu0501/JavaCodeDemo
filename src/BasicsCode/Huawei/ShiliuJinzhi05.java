package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * @author bobwu
 * @Title: ShiliuJinzhi05
 * @ProjectName niukecode
 * @date 2020-04-1813:39
 */
public class ShiliuJinzhi05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();
            str = str.substring(2);
            long l = Long.parseLong(str, 16);
            System.out.println(l);
        }


    }



}
