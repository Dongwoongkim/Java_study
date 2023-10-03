package aboutInnerClass.instance;

public class Outer1 {

    public void print(String s) {
        System.out.println("외부 클래스의 print method 실행 결과 " + s);
    }

    class Inner1 {
        public void print(String s) {
//            System.out.println("내부 클래스의 print method 실행 결과 " + s);
            Outer1.this.print(s);
        }
    }
}
