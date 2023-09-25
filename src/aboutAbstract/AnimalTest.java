package aboutAbstract;

public class AnimalTest {
    public static void main(String[] args) {

        // 익명 이너 클래스로 생성은 가능하다만, 만들어 사용할 이유가 전혀 없다.
        Animal animal = new Animal() {
            @Override
            public void bark() {
                System.out.println("BARKS!");
            }
        };

        animal.bark();
    }
}
