package aboutInterface.test3;

public class Tiger extends Mammal implements Animal{

    @Override
    public void walk() {
        System.out.println("Tiger WALK");
    }

    @Override
    public void run() {
        System.out.println("Tiger RUN");
    }

    @Override
    public void sleep() {
        System.out.println("TIGER SLEEP");
    }

    @Override
    public void eat() {
        System.out.println("TIGER EAT");
    }
}
