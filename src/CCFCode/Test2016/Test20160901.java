package CCFCode.Test2016;

import java.util.Scanner;

/**
 * 描述：
 * 最大波动时间
 *
 * @author wushunyu
 * @date 2019/9/14
 */
public class Test20160901 {

    public static void main(String[] args) {
        new Test20160901().run();
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }


        int max = 0;
        for (int j = 0,k = 1; j < array.length - 1; j++) {
                if (Math.abs(array[j] - array[k]) > max) {
                    max = Math.abs(array[j] - array[k]);
            }
                k++;
        }
        System.out.println(max);


    }


}
