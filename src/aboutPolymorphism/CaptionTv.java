package aboutPolymorphism;

public class CaptionTv extends Tv {
    String text;

    @Override
    void channelUp() {
        System.out.println("captionTv");
    }

    void caption() {
        System.out.println("text = " + text);
    }
}
