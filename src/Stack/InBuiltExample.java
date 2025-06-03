package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExample {
    public static void main(String[] args) {
        // stack
//    Stack<Integer> stack = new Stack<>();
//        stack.push(56);
//        stack.push(45);
//        stack.push(76);
//        stack.push(98);
//        stack.push(22);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        // queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(8);
        queue.add(5);
        queue.add(7);
        queue.add(3);
        queue.add(2);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


    }
}
