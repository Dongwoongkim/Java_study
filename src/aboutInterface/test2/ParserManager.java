package aboutInterface.test2;

public class ParserManager {

    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else{
            return new HTMLParser();
        }
    }
}
