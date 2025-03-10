package decorator.com.text;

import javax.swing.text.AbstractDocument;

public class BoldText extends TextDecorator{

    public BoldText(TextComponent textComponent) {
        super(textComponent);
    }
    @Override
    public String render() {

        return "<b>"+super.render()+"</b>";
    }
}
