package inputAndOutput.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        StringTokenizer st = new StringTokenizer(a, " ");

        while (st.hasMoreTokens()) {
            System.out.println("st = " + st.nextToken());
        }
    }
}
