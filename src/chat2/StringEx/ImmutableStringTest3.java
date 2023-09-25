package chat2.StringEx;

public class ImmutableStringTest3 {
    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = "HELLO";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // true
    }
}
