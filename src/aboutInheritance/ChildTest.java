package aboutInheritance;

public class ChildTest {
    public static void main(String[] args) {
        Child c = new Child();
//        c.printA(); // ERROR, 부모 클래스의 printA()는 private이므로 상속되지 않음
        c.printB();
        c.printC();
    }
}
