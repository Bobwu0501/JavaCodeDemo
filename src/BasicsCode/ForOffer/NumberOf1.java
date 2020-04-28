package BasicsCode.ForOffer;

/**
 * @author bobwu
 * @Title: NumberOf1
 * @ProjectName niukecode
 * @date 2020-04-2223:01
 */
public class NumberOf1 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(NumberOf1ss(-7));
        System.out.println(System.currentTimeMillis());
    }

    public static int NumberOf1s(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static int NumberOf1ss(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }


    //正数可以  负数会死循环
    public static int NumberOf1(int n) {
        if (n == 0) {
            return 0;
        }
        String s = "";

        if (n > 0) {
            s = Integer.toBinaryString(n);
        }
        if (n < 0) {
            s = Integer.toBinaryString((n ^ 1) + 1);
        }
        int i = s.length();
        int count = 0;
        while (i > 0) {
            if ((n & 1) == 1) {
                n = n >> 1;
                count++;
                i--;
            }
        }
        return count;
    }
}
