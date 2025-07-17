package QueueMethods_Stack_Methods;

import java.util.Stack;

public class Stack_methods {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.add(20);
        System.out.println(s);
        s.add(0,14);
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.search(0));
        System.out.println(s.peek());
        s.addFirst(9);
        System.out.println(s);
        s.addLast(3);
        System.out.println(s);
        s.remove(4);
        System.out.println(s);
    }
}
