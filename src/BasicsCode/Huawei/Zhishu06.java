package BasicsCode.Huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author bobwu
 * @Title: Zhishu06
 * @ProjectName niukecode
 * @date 2020-04-1813:51
 */
public class Zhishu06 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
//        List<Long> primes = getPrimes(num); //不需要计算质数因子
//        printfNums(num, primes);
        printfNumsV1(num);
    }


    public static void printfNumsV1(long num) {

        if (num == 1) {
            System.out.println(1);
        }
        if (num >= 2) {
            StringBuffer stringBuffer = new StringBuffer("");
            int i = 2;
            while (num != 1) {
                if (num % i == 0) {
                    stringBuffer.append(i + " ");
                    num = num / i;
                } else {
                    i++;
                }
            }
            System.out.println(stringBuffer);
        }
    }

    public static void printfNums(long num, List<Long> primes) {

        if (num == 1) {
            System.out.println(1);
        }
        if (num >= 2) {
            if (isPrime(num)) {
                System.out.println(num);
            } else {
                StringBuffer stringBuffer = new StringBuffer("");
                int i = 0;
                while (num != 1) {
                    if (num % primes.get(i) == 0) {
                        stringBuffer.append(primes.get(i) + " ");
                        num = num / primes.get(i);
                    } else {
                        i++;
                    }
                }
                System.out.println(stringBuffer);
            }
        }
    }


    public static List getPrimes(long num) {
        List<Long> list = new ArrayList<>();
        if (num == 1) {
            list.add(Long.valueOf(1));
            return list;
        }

        if (num >= 2) {
            if (num == 2) {
                list.add(Long.valueOf(2));
                return list;
            } else {
                int i = 2;
                while (i < num) {
                    if (isPrime(i)) {
                        list.add(Long.valueOf(i));
                    }
                    i++;
                }
            }
        }
        return list;
    }


    public static boolean isPrime(long num) {
        if (num == 1) {
            return true;
        } else {
            int flag = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = 1;
                }
            }

            if (flag == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
