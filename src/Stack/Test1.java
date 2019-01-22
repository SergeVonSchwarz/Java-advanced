package Stack;

import java.util.Stack;

public class Test1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("--------");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println("--------");

        stack.push(5);
        stack.push(1);
        stack.push(3);

        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
