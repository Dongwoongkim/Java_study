package aboutInnerClass.local;

public class Bag {

    private String name;
    public Bag(String name) {
        this.name = name;
    }

    public void method() {
        int k = 1; // 컴파일러가 자동으로 final을 붙여줍니다.
        class Pouch {
            private String color = "RED";
            //            static int k = 5; // static 멤버 사용 불가
            static final int cost = 5000; // 하지만 상수인 final static은 사용 가능

            public void printMember() {
                System.out.println("name = " + name); // 외부 클래스의 멤버에 접근 가능 ( private 여도 같은 클래스 내에서 접근하므로 ok )
                System.out.println("color = " + color); // 내부 클래스의 멤버
                System.out.println(k);
            }
        }

        new Pouch().printMember();
    }
}
