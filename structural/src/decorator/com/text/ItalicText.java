package decorator.com.text;

public class ItalicText extends TextDecorator
{
    public ItalicText(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String render() {

        return "<i>"+super.render()+"</i>";
    }
}
