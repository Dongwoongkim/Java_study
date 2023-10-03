package aboutVariables.literal;

public class LiteralTest {
    public static void main(String[] args) {
        long big = 010; // 8진수 10 -> 10진수 8
        long hexNum = 0x10; // 16진수 10 -> 10진수 16
        long binNum = 0b11; // 2진수 11 - > 10진수 3
        System.out.println("big = " + big);
        System.out.println("hexNum = " + hexNum);
        System.out.println("binNum = " + binNum);
    }
}
