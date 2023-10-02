package aboutInterface.test0;

import aboutInterface.test0.Evil;

public class Mosquito implements Evil {

    private void eat() {
        System.out.println("피를 빨아먹다");
    }

    @Override
    public void feelHarmful() {
        System.out.println("질병을 퍼뜨리므로 해롭다");
    }
}
