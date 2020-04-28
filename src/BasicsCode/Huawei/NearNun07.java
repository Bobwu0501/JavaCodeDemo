package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * @author bobwu
 * @Title: NearNun07
 * @ProjectName niukecode
 * @date 2020-04-1815:33
 */
public class NearNun07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Float f = scanner.nextFloat();

        String str = String.valueOf(f);
        String[] strings =  str.split("\\.");
        Integer ans = 0;
        if (Integer.valueOf(strings[1]) < 5){
            ans = f.intValue()+1;
        }else {
            ans = f.intValue();
        }
        System.out.println(ans);
    }
}
