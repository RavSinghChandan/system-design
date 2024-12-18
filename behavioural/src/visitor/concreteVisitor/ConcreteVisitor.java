package visitor.concreteVisitor;

import visitor.concrete.element.ConcreteElementA;
import visitor.concrete.element.ConcreteElementB;
import visitor.visitor.Visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visiting ConcreteElementA and performing operation.");
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visiting ConcreteElementB and performing operation.");
    }
}
