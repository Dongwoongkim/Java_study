package inputAndOutput.buffer;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i + "\n");
        }

        System.out.println(sb);
    }
}
