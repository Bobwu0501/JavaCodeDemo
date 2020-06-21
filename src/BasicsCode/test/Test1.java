package BasicsCode.test;

/**
 * @author bobwu
 * @Title: Test1
 * @ProjectName JavaCodeDemo
 * @date 2020-04-2819:20
 */
public class Test1 {


    public int[][] convert(TreeNode root) {
        // write code here
        int[][] array = new int[3][Integer.MAX_VALUE];

        int i = 0;
        while (root != null) {
            array[0][i] = root.val;
            i++;
            if (root.left != null) {
                root = root.left;
                continue;
            }
            if (root.right != null) {
                root = root.right;
                continue;
            }
        }

        int j = -1;
        while (root != null) {
            j++;
            if (root.left != null) {
                root = root.left;
                continue;
            }
            array[1][j] = root.val;
            if (root.right != null) {
                root = root.right;
                continue;
            }
        }

        int k = -1;
        while (root != null) {
            k++;
            if (root.left != null) {
                root = root.left;
                continue;
            }
            if (root.right != null) {
                root = root.right;
                continue;
            }
            array[2][k] = root.val;
        }


        return array;

    }

}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}