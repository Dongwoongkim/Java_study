package aboutAbstract;

public class Cat extends Animal {

    private String type;

    public Cat(String type) {
        this.type = type;
    }

    @Override
    public void bark() {
        System.out.println("This Cat howl like " + this.type);
    }

    @Override
    public void sleep() {
        System.out.println("Meow...zZ");
    }
}
