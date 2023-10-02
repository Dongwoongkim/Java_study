package aboutInterface.test3;

public class Lion extends Mammal implements Animal {


    @Override
    public void walk() {
        System.out.println("Lion WALK");
    }

    @Override
    public void run() {
        System.out.println("Lion RUN");
    }

    @Override
    public void sleep() {
        System.out.println("Lion SLEEP");
    }

    @Override
    public void eat() {
        System.out.println("Lion EAT");
    }
}
