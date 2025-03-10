package decorator.com.text;

public class PlainText implements TextComponent{

    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text;
    }
}
