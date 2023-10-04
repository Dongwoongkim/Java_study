package aboutCollections.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> ll = new LinkedList<>(Arrays.asList("1st", "second", "third")); // 선언 및 초기화
        List<String> ll2 = new LinkedList<>(); // 선언

        // 추가
        ll.add("fourth");
        ll.add("fifth");

        // 변경
        ll.set(0, "first");

        // 삭제
        ((LinkedList<String>) ll).removeFirst(); // 첫번째 요소 삭제 (업캐스팅 to LinkedList)
        ((LinkedList<String>) ll).removeLast(); // 마지막 요소 삭제 (업캐스팅 to LinkedList)
//        ll.remove(2); // 인덱스로 삭제

        // 크기
        int size = ll.size(); // 컬렉션 크기

        // 검색
        String s = ll.get(0);// 인덱스로 검색
        String first = ((LinkedList<String>) ll).getFirst(); // 첫번째 요소 리턴 (업캐스팅 to LinkedList)
        String last = ((LinkedList<String>) ll).getLast(); // 마지막 요소 리턴 (업캐스팅 to LinkedList)


        // 이터레이터
        Iterator<String> iterator = ll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
