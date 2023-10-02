package aboutInterface.test1.animal;

import aboutInterface.test1.Eatable;

public class Cow extends Animal implements Eatable {
    @Override
    public void eatable() {
        System.out.println("EAT COW");
    }
}
