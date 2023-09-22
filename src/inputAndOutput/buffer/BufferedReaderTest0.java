package inputAndOutput.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        int result = Integer.valueOf(line[0]) + Integer.valueOf(line[1]);

        System.out.println("result = " + result);
    }
}
