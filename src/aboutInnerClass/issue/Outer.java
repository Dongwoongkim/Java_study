package aboutInnerClass.issue;

public class Outer {
    private int[] data;
    static class Inner {
    }

    public Outer(int size) {
        data = new int[size];
    }

    Inner getInnerObject() {
        return new Inner();
    }
}
