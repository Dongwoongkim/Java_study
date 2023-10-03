package aboutVariables.StringEx;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person();
        System.out.println(p.getName().equals(p2.getName())); // 동등성 검사 ( 값이 같은지 )
        System.out.println(p.getName() == p2.getName()); // 동일성 검사 ( 주소까지 같은지 )
    }
}
