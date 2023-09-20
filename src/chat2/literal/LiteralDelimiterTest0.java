package chat2.literal;

public class LiteralDelimiterTest0 {
    public static void main(String[] args) {
        // 16진수 12 * 2^3 = (16 + 2) * 8 = 144.0
        double d = 0x12p3;

        // 3 * 10^3 = 3000
        double a = 3e3;

        System.out.println("d = " + d);
        System.out.println("a = " + a);
    }
}
