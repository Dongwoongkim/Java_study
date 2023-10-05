package aboutCollections.queue.deque;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {
    public static void main(String[] args) {
        Deque<String> adq = new ArrayDeque<>();
        adq.offerLast("KIM"); // [KIM]
        adq.offerFirst("PARK"); // [PARK, KIM]
        adq.offerFirst("CHOI"); // [CHOI, PARK, KIM]
        adq.offerLast("NA"); // [CHOI, PARK, KIM, NA]

        System.out.println(adq.pollFirst()); // CHOI <- [ PARK, KIM, NA ]
        System.out.println(adq.pollLast()); // NA <- [ PARK, KIM ]
    }
}
