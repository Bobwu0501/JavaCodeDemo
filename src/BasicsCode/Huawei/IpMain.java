package BasicsCode.Huawei;

import java.util.Scanner;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/13
 */
public class IpMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int typeA = 0;
        int typeB = 0;
        int typeC = 0;
        int typeD = 0;
        int typeE = 0;
        int errorIpOrMaskCode = 0;
        int privIp = 0;


        while (scanner.hasNext()){
            String ipt = scanner.nextLine();
            String[] ipAndMaskCode = ipt.split("~");
            String ip = ipAndMaskCode[0];
            String maskCode = ipAndMaskCode[1];

            


        }



    }


}
