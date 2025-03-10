package decorator.com.text;

public class Client {
    public static void main(String[] args) {

        TextComponent text = new PlainText("Hello, World!");

        // Applying decorators
        TextComponent boldText = new BoldText(text);

        System.out.println(boldText.render());
        TextComponent italicText = new ItalicText(boldText);

        System.out.println( italicText.render());
    }
}
