package visitor.chandan;

public class VastuConsultation implements Consultation{
    private String vastuType = "Home Vastu Consultation";

    public void accept(ConsultationVisitor visitor) {
        visitor.visit(this);
    }

    public String getVastuType() {
        return vastuType;
    }
}
