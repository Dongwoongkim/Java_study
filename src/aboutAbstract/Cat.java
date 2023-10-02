package aboutAbstract;

public class Cat extends Animal{

    public Cat(String type) {
        this.type = type;
    }

    public void bark() {
        System.out.println("This Cat howl like " + this.type);
    } // 중복 멤버
}
