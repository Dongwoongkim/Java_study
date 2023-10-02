package aboutInterface.test1.plants;

import aboutInterface.test1.Eatable;

public class Potato extends Plants implements Eatable {
    @Override
    public void eatable() {
        System.out.println("EAT POTATO");
    }
}
