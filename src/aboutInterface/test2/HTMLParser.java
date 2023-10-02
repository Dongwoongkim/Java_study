package aboutInterface.test2;

public class HTMLParser implements Parseable {

    @Override
    public void parse(String fileName) {
        System.out.println(fileName + " HTML Parsing");
    }
}
