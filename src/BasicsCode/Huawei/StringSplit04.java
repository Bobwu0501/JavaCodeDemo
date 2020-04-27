package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * @author bobwu
 * @Title: StringSplit04
 * @ProjectName niukecode
 * @date 2020-04-1811:36
 */
public class StringSplit04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            func2(str);
        }

    }


    public static void func2(String str){
        while (str.length() >=8 ){
            System.out.println(str.substring(0,8));
            str = str.substring(8);
        }
        if (str.length()<8 && str.length()>0){
            str = str+"00000000";
            System.out.println(str.substring(0,8));
        }
    }










    public static void func(String str) {
        if (str.length() <= 8) {
            StringBuffer sb = new StringBuffer(str);
            for (int i = sb.length(); i < 8; i++) {
                sb.append("0");
            }
            System.out.println(sb.toString());
        }
        if (str.length() > 8) {
            //大于8
            int j = 1;
            while (str.length() > 8) {
                String str1 = str.substring(0, 8);
                System.out.println(str1);
                str = str.substring(8 * j, str.length());
                j++;
            }
            //小于8
            if (str.length()< 8 && str.length() > 0){
                StringBuffer sb = new StringBuffer(str);
                for (int i = sb.length(); i < 8; i++) {
                    sb.append("0");
                }
                System.out.println(sb.toString());
            }

        }
    }
}
