package oop.classAndInstance;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("RANGE ROVER EVOQUE", "2018", "RED", 50L, 200L);
        car.brake();
        car.accelerate();
    }
}
