package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * 汽水瓶
 *
 * @author bobwu
 * @Title: WaterBool
 * @ProjectName niukecode
 * @date 2020-04-1915:58
 */
public class WaterBool022 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num < 3) {
                System.out.println(0);
            } else {
                int count = num;
                int ans = 0;

                while (count >= 2) {
                    count = count - 3;
                    ans++;
                    count = count + 1;
                }
                if (count == 2) {
                    ans++;
                    break;
                }
                System.out.println(ans);
            }
        }
    }
}
