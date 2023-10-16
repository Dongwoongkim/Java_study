package thoughtWorks.first;

public class Book {
    private char[][] data = new char[10][10];

    public Book(char[][] data) {
        this.data = data;
    }
    private String readBook() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 10; i++) { // 1
            readLine(buf, i);
        }
        return buf.toString();
    }

    private void readLine(StringBuffer buf, int i) {
        for (int j = 0; j < 10; j++) { // 2
            buf.append(data[i][j]);
        }
    }
}
