package aboutInnerClass.staticInner;

public class Outer {
    int a = 1; // instane 멤버
    static int a2 = 3; // static 멤버
    static int a3 = new Inner().b; // static 멤버끼리는 접근 가능


    void print() { // instance 멤버 -> static 멤버 접근 가능
        a3 = 4;
        System.out.println(a3);
    }
    static class Inner {
        int b = 1; // instance 멤버

        static void print() {
//            System.out.println(b); // static 멤버 -> instance 멤버 접근 불가능
//            System.out.println(a); // static 멤버 -> instance 멤버 접근 불가능
            System.out.println(a2); // static 멤버 -> static 멤버 접근 가능
        }
    }
}
