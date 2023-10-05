package aboutCollections.queue.deque;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        Deque<String> ll = new LinkedList<>();
        ll.offer("Hello");
        ll.offer("World");
        ll.offerFirst("HI");
        System.out.println(ll.pollFirst());
    }
}
