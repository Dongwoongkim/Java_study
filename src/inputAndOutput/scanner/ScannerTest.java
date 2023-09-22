package inputAndOutput.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double d = sc.nextDouble();
        String str = sc.next();

        System.out.println("a = " + a);
        System.out.println("d = " + d);
        System.out.println("str = " + str);

        int k = sc.nextInt();
        int k2 = sc.nextInt();

    }
}
