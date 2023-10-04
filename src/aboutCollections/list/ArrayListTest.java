package aboutCollections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(); // 선언

        l.add(1); // 추가
        l.add(2); // 추가
        l.add(3); // 추가
        l.add(9); // 추가
        l.add(9); // 추가

        l.set(0, 3); // 0번째 인덱스에 값 3으로 변경
        l.remove(4); // 인덱스로 제거
        l.remove(Integer.valueOf(3)); // 컬렉션 내부를 순차적으로 조회하여 동등(값이 동일)한 객체가 존재하면 하나 제거

        int size = l.size(); // 크기

        Integer getFirst = l.get(0);// 0번째 인덱스의 객체 리턴

        boolean contains = l.contains(9); // 요소의 존재 여부
        int i = l.indexOf(9); // 요소의 인덱스 리턴 (없으면 -1리턴)


        Iterator<Integer> iterator = l.iterator(); // 이터레이터
        while (iterator.hasNext()) { // 이터레이터 순회
            System.out.println(iterator.next()); // 이터레이터 출력
        }
    }
}
