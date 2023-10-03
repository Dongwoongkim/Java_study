package aboutVariables.StringEx;

public class ImmutableStringTest {
    public static void main(String[] args) {
        String str1 = "Hello"; // 새로운 String 객체 생성
        String str2 = str1;    // str2는 str1과 같은 객체를 참조

        System.out.println("Before Modification:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // 문자열 연산 수행 (새로운 String 객체 생성)
        str1 = str1 + ", World";

        System.out.println("\nAfter Modification:");
        System.out.println("str1: " + str1); // "Hello, World"
        System.out.println("str2: " + str2); // "Hello"

        // str1이 변경되었지만 str2는 변경되지 않음을 확인할 수 있습니다.
    }
}
