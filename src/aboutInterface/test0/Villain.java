package aboutInterface.test0;

public class Villain implements Evil {

    private void doBadThings() {
        System.out.println("나쁜 짓을 하다");
    }

    @Override
    public void feelHarmful() {
        System.out.println("사람들을 괴롭히므로 해롭다");
    }
}
