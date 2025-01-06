package visitor.chandan;

public class PalmReading implements Consultation{
    private String palmType = "Life Line Palm Reading";

    public void accept(ConsultationVisitor visitor) {
        visitor.visit(this);
    }

    public String getPalmType() {
        return palmType;
    }
}
