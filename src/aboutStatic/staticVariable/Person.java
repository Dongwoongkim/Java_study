package aboutStatic.staticVariable;

public class Person {
    private Long id = 1L;
    public void printId() {
        System.out.println(System.identityHashCode(id));
    }
}
