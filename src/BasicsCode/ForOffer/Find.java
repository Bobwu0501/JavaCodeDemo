package BasicsCode.ForOffer;

/**
 * 二维数组中的查找
 *
 * @author bobwu
 * @Title: lengthOfLongestSubstring
 * @ProjectName niukecode
 * @date 2020-04-1520:10
 */
public class Find {


    public static void main(String[] args) {


    }

    public boolean Find1(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean Find2(int target, int[][] array) {

        int rowCount = array.length;
        int colCount = array[0].length;
        
        int i, j;
        //从左下角开始
        for (i = rowCount - 1, j = 0; i >= 0 && j < colCount; ) {
            if (target == array[i][j]) {
                return true;
            }
            if (target < array[i][j]) {
                i--;
                continue;
            }
            if (target > array[i][j]) {
                j++;
                continue;
            }
        }
        return false;
    }


}
