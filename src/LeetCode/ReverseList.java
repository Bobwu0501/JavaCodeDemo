package LeetCode;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/23
 */
public class ReverseList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode node = ReverseList(head);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }


    }


    public static ListNode ReverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode pre = null;
        ListNode next = null;

        while (head != null) {

            next = head.next;
            head.next = pre;

            pre = head;
            head = next;
        }

        return pre;
    }
}


