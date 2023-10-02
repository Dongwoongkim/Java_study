package aboutInterface.test2;

public class ParserTest {
    public static void main(String[] args) {
        Parseable pm = ParserManager.getParser("XML");
        pm.parse("doc.xml");
    }
}
