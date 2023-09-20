package chat2.StringEx;

public class ImmutableStringTest2 {
    public static void main(String[] args) {
        String a = "1";
        String b = "1";
        String c = "1";

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
    }
}
