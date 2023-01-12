
import java.util.*;

public class DequeQ {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); //1
        deque.addFirst(2); //2
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        // deque.removeFirst();
        // System.out.println(deque);
        deque.removeLast();
        System.out.println();

        System.out.println("first el = " + deque.getFirst());
        System.out.println("last el = " +deque.getLast());
    }
}
