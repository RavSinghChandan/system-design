package visitor.visitor;

import visitor.concrete.element.ConcreteElementA;
import visitor.concrete.element.ConcreteElementB;

public interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}
