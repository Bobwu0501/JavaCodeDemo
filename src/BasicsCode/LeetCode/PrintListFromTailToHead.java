package BasicsCode.LeetCode;

import BasicsCode.InvokeDemo.A;

import java.util.ArrayList;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/22
 */
public class PrintListFromTailToHead {

    public static void main(String[] args) {

    }


    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        if (listNode == null) {
            return arrayList;
        }

        while (listNode != null) {
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            arrayList2.add(arrayList.get(i));
        }
        return arrayList2;
    }

}

class ListNode {

    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
