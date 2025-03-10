package decorator.com.text;

public class Client {
    public static void main(String[] args) {

        TextComponent parent = new PlainText("Hello, World!");

        // Applying decorators
        TextComponent boldTextFeature1 = new BoldText(parent);

        System.out.println(boldTextFeature1.render());
        TextComponent italicTextFeature2 = new ItalicText(boldTextFeature1);

        System.out.println( italicTextFeature2.render());
    }
}
