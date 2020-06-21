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

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }

        return arrayList;

    }
}
