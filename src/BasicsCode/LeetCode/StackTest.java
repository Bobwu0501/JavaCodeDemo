package BasicsCode.LeetCode;

import java.util.Stack;

/**
 * 描述：
 * 两个栈实现一个队列
 *
 * @author wushunyu
 * @date 2020/4/22
 */
public class StackTest {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int num = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return num;
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(pop());
        push(4);
        push(5);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }

}
