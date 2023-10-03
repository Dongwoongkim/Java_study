package aboutInnerClass.issue;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Object> l = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            l.add(new Outer(100000000).getInnerObject());
            System.out.println(i);
        }
    }
}
