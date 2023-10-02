package aboutInterface.polymorphism;


public class FighterTest {
    public static void main(String[] args) {
        Fightable f = new Fighter("fighter1");
        f.attack(50, new Boxer("boxer1"));
    }
}
