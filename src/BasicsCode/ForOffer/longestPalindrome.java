package BasicsCode.ForOffer;

import java.util.Scanner;

/**
 * @author bobwu
 * @Title: longestPalindrome
 * @ProjectName niukecode
 * @date 2020-04-1522:48
 */
public class longestPalindrome {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(longestPalindrome(str));


    }

    public static String longestPalindrome(String s) {
        String ans = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String tmp = s.substring(i, j);
                if (isPalindrome(tmp) && tmp.length() > max) {
                    ans = tmp;
                    max = Math.max(ans.length(), max);
                }

            }
        }
        return ans;
    }


    public static boolean isPalindrome(String tmp) {
        int length = tmp.length() - 1;

        for (int i = 0; i < tmp.length() / 2; i++) {
            if (tmp.charAt(i) != tmp.charAt(length - i)) {
                return false;
            }
        }
        return true;
    }


}
