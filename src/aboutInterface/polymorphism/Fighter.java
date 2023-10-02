package aboutInterface.polymorphism;

public class Fighter implements Fightable{
    private String name;

    public Fighter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void attack(int power, Fightable f) {
        System.out.println("Fighter attack " + f.getName() + " with " + power);
    }

}
