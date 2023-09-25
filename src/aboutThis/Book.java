package aboutThis;

public class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public Book(String title) {
        this.title = title;
        this.price = 0;
//        this(title, 0);
    }
}
