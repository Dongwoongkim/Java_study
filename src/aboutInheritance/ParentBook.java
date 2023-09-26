package aboutInheritance;

public class ParentBook {
    String title;
    String genre;

    ParentBook(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public void print() {
        System.out.println("TITLE : " + title);
        System.out.println("GENRE : " + genre);
    }
}
