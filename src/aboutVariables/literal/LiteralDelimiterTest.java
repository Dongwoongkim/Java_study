package aboutVariables.literal;

public class LiteralDelimiterTest {
    public static void main(String[] args) {
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFFL;
        System.out.println("big = " + big);
        System.out.println("hex = " + hex);
    }
}
