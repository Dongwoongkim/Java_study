package aboutInterface.test;

public interface Car {

    public static final String name = "자동차";
    public static final int wheel = 4;

    default void openWindow() { // After JDK 1.8 ver
        System.out.println("창문 열기");
    }

    static int getWheel() { // After JDK 1.8 ver
        return wheel;
    }

    abstract void start();
    void stop();
    String ModelName();
}
