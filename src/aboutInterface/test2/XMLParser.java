package aboutInterface.test2;

public class XMLParser implements Parseable {

    @Override
    public void parse(String fileName) {
        System.out.println(fileName + " XML Parsing");
    }
}
