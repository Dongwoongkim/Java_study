package aboutCollections.list;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        // 삽입
        s.push("FIRST");
        s.push("SECOND");
        s.push("THIRD");

        System.out.println(s.peek()); // THIRD

        s.pop(); // 제거

        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
