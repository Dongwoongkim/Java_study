package aboutInheritance;

import java.io.StringWriter;

public class ChildBook extends ParentBook{

    private String writer;

    ChildBook(String title, String genre, String writer) {
        super(title, genre);
        this.writer = writer;
    }
}
