package chat2.wrapper;

public class WrapperTest {
    public static void main(String[] args) {
        Long value1 = Long.valueOf(1); // long to Long (Boxing)
        Long value2 = Long.valueOf(2); // long to Long (Boxing)
//        long value3 = null; // null 초기화 불가능
        Long value4 = null; // null 초기화 가능

        value1 = Long.valueOf(2L);

        String a = "hi";
        a = "hi~";
        System.out.println("a = " + a);
    }
}


