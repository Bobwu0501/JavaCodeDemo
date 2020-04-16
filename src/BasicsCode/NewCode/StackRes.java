package BasicsCode.NewCode;

import java.util.Stack;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/8
 */
public class StackRes {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int first = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return first;
    }

}
