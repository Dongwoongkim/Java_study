package aboutInnerClass.staticInner;

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.print();
        Outer.Inner.print();
    }
}
