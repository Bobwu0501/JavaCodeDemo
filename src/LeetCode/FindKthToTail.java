package LeetCode;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/23
 */
public class FindKthToTail {

    public static void main(String[] args) {


    }

    public ListNode FindKthToTail(ListNode head, int k) {

        ListNode tmp = head;
        int i = 0;
        while (tmp != null) {
            tmp = tmp.next;
            i++;
        }

        if (k > i) {
            return null;
        }

        for (int j = 0; j < i - k; j++) {
            head = head.next;
        }
        return head;
    }
}

class LsitNode {
    int val;
    ListNode next;

    public LsitNode(int val) {
        this.val = val;
    }
}
