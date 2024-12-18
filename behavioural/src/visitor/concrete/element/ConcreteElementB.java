package visitor.concrete.element;

import visitor.element.Element;
import visitor.visitor.Visitor;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Passes itself to the visitor
    }
}
