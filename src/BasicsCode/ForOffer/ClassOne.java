package BasicsCode.ForOffer;

/**
 * 描述：
 * 二维数组的查找
 *
 * @author wushunyu
 * @date 2020/4/8
 */
public class ClassOne {
    public static boolean Find(int target, int[][] array) {

        int len1 = array.length;
        if (len1 == 0) {
            return false;
        } else {
            for (int i = 0; i < len1; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (array[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean find(int target, int[][] array) {

        boolean isFind = false;

        if (array != null && array.length > 0 && array[0].length > 0) {

            int row = 0;
            int column = array[0].length - 1;
            while (row < array.length && column >= 0) {
                if (array[row][column] == target) {
                    isFind = true;
                    break;
                } else if (array[row][column] > target) {
                    column--;
                } else {
                    row++;
                }
            }

        }
        return isFind;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(Find(18, matrix));
        System.out.println(find(2, matrix));
    }
}
