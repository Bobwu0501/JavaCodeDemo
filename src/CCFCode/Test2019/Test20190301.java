package CCFCode.Test2019;

import java.util.Scanner;

/**
 * 描述：
 * 小中大
 *
 * @author wushunyu
 * @date 2019/9/10
 */
public class Test20190301 {

    public static void main(String[] args) {
        new Test20190301().run();
    }


    public void run() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] out = new int[3];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
            if (array[i] <= min) {
                min = array[i];
            }
        }
        out[0] = max;
        out[1] = min;
        if (n % 2 == 0) {
            int tmp1 = n / 2;
            int tmp2 = n / 2 + 1;
            out[2] = (array[tmp1-1] + array[tmp2-1]) / 2;
        } else {
            int ttt = n/2;
            out[2] = array[ttt];
        }
        if (out[2] > out[0]) {
            int tmp = out[2];
            out[2] = min;
            out[1] = max;
            out[0] = tmp;
        }
        if (out[1] < out[2]) {
            int tt = out[2];
            out[1] = tt;
            out[2] = min;
        }
        System.out.print(out[0] + " " + out[1] + " " + out[2]);


    }
}











