package aboutCollections.queue.priority_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("kim", 1));
        pq.add(new Student("park", 4));
        pq.add(new Student("choi", 2));
        pq.add(new Student("na", 3));

        System.out.println(pq);

        // 차례대로 꺼내기 poll
        System.out.println(pq.poll().getName());
        System.out.println(pq.poll().getName());
        System.out.println(pq.poll().getName());
        System.out.println(pq.poll().getName());
    }
}
