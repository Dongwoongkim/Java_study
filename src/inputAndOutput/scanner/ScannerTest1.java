package inputAndOutput.scanner;

import java.util.Scanner;

public class ScannerTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int k = sc.nextInt();
            System.out.println("k = " + k);
        }
    }
}
