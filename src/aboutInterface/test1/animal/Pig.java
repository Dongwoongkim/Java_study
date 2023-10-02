package aboutInterface.test1.animal;

import aboutInterface.test1.Eatable;

public class Pig extends Animal implements Eatable {
    @Override
    public void eatable() {
        System.out.println("EAT PIG");
    }
}
