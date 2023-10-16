package thoughtWorks.second.ex1;

public class Calculator {

    private int calculate(int a, int b, String op) {
        if (op.equals("*")) {
            return a * b;
        }
        return a + b;
    }
}
