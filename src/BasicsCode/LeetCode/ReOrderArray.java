package BasicsCode.LeetCode;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/23
 */
public class ReOrderArray {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 3, 2, 5, 6, 8, 9};
        reOrderArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }


    public static void reOrderArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 ; j++) {
                if ((array[j] % 2 == 0) && (array[j + 1] % 2 == 1)) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }


}
