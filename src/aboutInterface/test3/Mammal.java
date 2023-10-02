package aboutInterface.test3;

public abstract class Mammal implements Animal{

    private String sex; // 중복
    private String color; // 중복

    public String getSex() { // 중복
        return sex;
    }

    public String getColor() { // 중복
        return color;
    }
}
