package aboutInnerClass;


public class Outer {

    class InstanceClass{} // 내부 인스턴스 클래스

    static class StaticClass{} // 내부 스태틱 클래스

    void method() {
        class LocalClass{}  // 내부 지역 클래스
    }
}
