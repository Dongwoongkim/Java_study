package aboutAbstract;

public class Dog extends Animal{

    private String species;

    public Dog(String species) {
        this.species = species;
    }

    @Override
    public void bark() {
        System.out.println("This puppy barks like " + this.species);
    }

}
