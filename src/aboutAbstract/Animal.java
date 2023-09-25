package aboutAbstract;

abstract class Animal {

    int wakeUpHour = 9;

    public abstract void bark();
    public void sleep() {
        System.out.println("Sleeping...zZZ");
    }

    public void wakeUp() {
        System.out.println("Wake Up at" + wakeUpHour);
    }
}
