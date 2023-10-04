package aboutInnerClass.issue;

public class Outer1 {
    private int k = 1;

    public int getK() {
        return k;
    }

    class Inner {
        int getOuterField() {
            return Outer1.this.getK(); // 외부를 참조하는 외부클래스.this 키워드가 동작하지 않는 모습 (static class일 때)
        }
    }
}






