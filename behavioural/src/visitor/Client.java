package visitor;

import visitor.concrete.element.ConcreteElementA;
import visitor.concrete.element.ConcreteElementB;
import visitor.concreteVisitor.ConcreteVisitor;
import visitor.element.Element;
import visitor.visitor.Visitor;

public class Client {
    public static void main(String[] args) {
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();

        // Create visitor
        Visitor visitor = new ConcreteVisitor();

        // Client passes the visitor to the elements
        System.out.println("Client starts visiting elements:");
        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}
