package visitor.chandan;

public class AppointmentBookingVisitor implements ConsultationVisitor{
    @Override
    public void visit(PalmReading palmReading) {
        System.out.println("Booking an appointment for: " + palmReading.getPalmType());
    }

    @Override
    public void visit(VastuConsultation vastuConsultation) {
        System.out.println("Booking an appointment for: " + vastuConsultation.getVastuType());
    }
}
