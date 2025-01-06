package visitor.chandan;

public class FeedbackVisitor implements ConsultationVisitor{
    @Override
    public void visit(PalmReading palmReading) {
        System.out.println("Providing feedback for: " + palmReading.getPalmType() + " - Very accurate!");
    }

    @Override
    public void visit(VastuConsultation vastuConsultation) {
        System.out.println("Providing feedback for: " + vastuConsultation.getVastuType() + " - Great advice!");
    }
}
