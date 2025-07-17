package QueueMethods_Stack_Methods;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
public class Queue_Examples_And_Methods {
    public static void main(String[] args) {
        Queue<Integer> queue=new ConcurrentLinkedQueue<>();
        queue.add(10);queue.add(20);queue.add(30); queue.add(40); queue.add(50);
        queue.add(10);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.offer(12);
        System.out.println(queue);
        queue.element();
        System.out.println(queue);
        int var =queue.peek();
        System.out.println(var);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
