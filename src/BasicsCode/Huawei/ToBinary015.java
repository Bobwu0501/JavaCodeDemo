package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * @author bobwu
 * @Title: ToBinary015
 * @ProjectName niukecode
 * @date 2020-04-1822:28
 */
public class ToBinary015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            Integer num = scanner.nextInt();
            String s = Integer.toBinaryString(num);
            char[] chars = s.toCharArray();
            int ans = 0;
            for (int i = 0; i< chars.length;i++){
                if (chars[i] == '1'){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
