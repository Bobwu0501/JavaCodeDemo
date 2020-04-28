package BasicsCode.Huawei;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/20
 */
public class PrimesFriend {
    public static void main(String[] args) {


    }


    public static boolean isAllPrimes(int num1, int num2) {

        if (isPrime(num1) && isPrime(num2) && isPrime(num1 + num2)){

        }
        return true;
    }

    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
