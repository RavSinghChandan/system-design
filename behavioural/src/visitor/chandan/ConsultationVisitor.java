package visitor.chandan;

public interface ConsultationVisitor {
    void visit(PalmReading palmReading);
    void visit(VastuConsultation vastuConsultation);
}
