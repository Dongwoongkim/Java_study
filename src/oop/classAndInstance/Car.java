package oop.classAndInstance;

public class Car {

    public String modelName; // 필드
    public String modelYear; // 필드
    public String color; // 필드
    private Long currentSpeed;
    public Long maxSpeed; // 필드

    public Car(String modelName, String modelYear, String color, Long currentSpeed, Long maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
    }

    public void brake() { // 메소드 - 인스턴스가 특정 작업을 수행하기 위한 함수
        this.currentSpeed = 0L;
    }

    public void accelerate() { // 메소드
        this.currentSpeed++;
    }
}
