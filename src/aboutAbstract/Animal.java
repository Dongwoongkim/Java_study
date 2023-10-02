package aboutAbstract;

abstract class Animal {

    String type;
    int wakeUpHour;

    public abstract void bark();

    public void sleep() {
        System.out.println("Sleeping...zZZ");
    }
}
