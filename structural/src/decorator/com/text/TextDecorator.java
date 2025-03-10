package decorator.com.text;

public abstract class TextDecorator implements TextComponent{
    private TextComponent textComponent;

    public TextDecorator(TextComponent textComponent) {
        this.textComponent = textComponent;
    }

    @Override
    public String render(){
        return textComponent.render();
    }
}
