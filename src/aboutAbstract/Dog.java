package aboutAbstract;

public class Dog extends Animal {

    public Dog(String type) {
        this.type = type;
    }

    public void bark() { // 중복 멤버
        System.out.println("This puppy barks like " + this.type);
    }

}
