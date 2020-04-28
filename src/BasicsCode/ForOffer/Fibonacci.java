package BasicsCode.ForOffer;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/8
 */
public class Fibonacci {

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n >= 2) {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(6));
    }

}
