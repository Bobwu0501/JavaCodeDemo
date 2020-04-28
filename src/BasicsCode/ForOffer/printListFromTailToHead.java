package BasicsCode.ForOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 描述：
 * 从尾到头打印链表
 *
 * @author wushunyu
 * @date 2020/4/8
 */
public class printListFromTailToHead {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ListNode tmp = listNode;

        while (tmp != null) {
            stack.push(tmp.val);
            tmp = tmp.next;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
