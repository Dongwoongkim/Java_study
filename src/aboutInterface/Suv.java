package aboutInterface;

public class Suv implements Car{

    private String modelName;

    @Override
    public void start() {
        System.out.println("시동이 켜졌습니다.");
    }

    @Override
    public void stop() {
        System.out.println("시동을 끕니다.");
    }

    @Override
    public String ModelName() {
        return name + this.modelName;
    }
}
