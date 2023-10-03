package aboutVariables.StringEx;

public class Person {

    private String name = "KIM";

    public String getName() {
        return name;
    }

    private void introduce() {
        System.out.println("My Name is " + this.name);
    }
}
