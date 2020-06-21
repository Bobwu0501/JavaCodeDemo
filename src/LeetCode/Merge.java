package LeetCode;

import java.util.Scanner;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/23
 */
public class Merge {

    public ListNode Merge(ListNode list1, ListNode list2) {

        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 1) {
                    count++;
                    array = daoyu(array, i, j);
                }
            }
        }

        System.out.println(count);

    }

    public static int[][] daoyu(int[][] array, int i, int j) {
        array[i][j] = 2;
        if (i - 1 >= 0 && array[i - 1][j] == 1) {
            daoyu(array, i - 1, j);
        }
        if (i + 1 < array.length && array[i + 1][j] == 1) {
            daoyu(array, i + 1, j);
        }
        if (j - 1 >= 0 && array[i][j - 1] == 1) {
            daoyu(array, i, j - 1);
        }
        if (j + 1 < array[i].length && array[i][j + 1] == 1) {
            daoyu(array, i, j + 1);
        }
        return array;
    }
}
