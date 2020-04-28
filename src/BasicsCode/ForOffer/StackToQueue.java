package BasicsCode.ForOffer;

import java.util.Stack;

/**
 * @author bobwu
 * @Title: StackToQueue
 * @ProjectName niukecode
 * @date 2020-04-2221:42
 */
public class StackToQueue {

    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();


    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        System.out.println(pop());
        System.out.println(pop());
        push(4);
        System.out.println(pop());



    }


    public static void push(int num) {
        stack1.push(num);
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


}
