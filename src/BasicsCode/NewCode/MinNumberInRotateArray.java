package BasicsCode.NewCode;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/8
 */
public class MinNumberInRotateArray {

    public static int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            } else {
                if (i == array.length - 2) {
                    return array[0];
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] ints = {3, 4, 5, 6, 0, 1, 2};
        System.out.println(minNumberInRotateArray(ints));
    }


}
