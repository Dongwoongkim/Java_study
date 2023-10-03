package aboutInnerClass.anonymous;

public class Main {
    public static void main(String[] args) {
        Printable a = new Printable() {
            @Override
            public void print() {
                System.out.println("HI");
            }
        };

        a.print();
    }
}
