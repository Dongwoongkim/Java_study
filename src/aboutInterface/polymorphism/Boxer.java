package aboutInterface.polymorphism;

public class Boxer implements Fightable {

    private String name;

    public Boxer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void attack(int power, Fightable f) {
        System.out.println("Boxer attack " + f + " with " + power);
    }
}
