package aboutPolymorphism;

public class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp() {
        System.out.println("Tv");
        channel++;
    }
    void channelDown() {
        channel--;
    }
}
