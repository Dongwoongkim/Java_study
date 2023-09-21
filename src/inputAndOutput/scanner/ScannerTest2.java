package inputAndOutput.scanner;

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(); // 정수 + '\n'
        sc.nextLine();
        String s = sc.nextLine();  // s에 줄바꿈문자가 자동으로 들어가게 됩니다.
        System.out.println("i = " + i);
        System.out.println("s = " + s);
    }
}
