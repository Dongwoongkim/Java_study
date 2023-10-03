package aboutInnerClass.staticInner;

public class StaticTest2 {

    class A{

    }
    static class InnerStatic{}

    public static void main(String[] args) {
        InnerStatic a = new StaticTest2.InnerStatic();
        InnerStatic b = new StaticTest2.InnerStatic();

        System.out.println(a);
        System.out.println(b);

        System.out.println(a==b);
    }
}
